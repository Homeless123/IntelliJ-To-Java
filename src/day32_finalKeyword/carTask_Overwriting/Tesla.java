package day32_finalKeyword.carTask_Overwriting;


import java.util.*;

public  class Tesla extends Car{


    public Tesla( String model, String color, int year, double price) {
        super( model, color, year, price);

    }
    public final void autoPilot(){
        System.out.println(getModel()+" "+getModel()+" is in self-driving mode");
    }

    @Override
    public void setModel(String model) {
       ArrayList <String>models = new ArrayList();
       models.addAll ( Arrays.asList("Model S", "Model Y", "Model x", "Model 3") );
       if (! models.contains(model) ){// if specified model is not valid model
           System.err.println("Invalid model: "+model);
           System.exit(1);
       }
       super.setModel(model);// this.model= model;
    }

    @Override
    public void setColor(String color) {
        ArrayList <String>colors = new ArrayList();
        colors.addAll( Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green") );
        if (! colors.contains(color) ){
            System.err.println("Invalid Tesla Color: "+color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setPrice(double price) {
        if (price < 50_000){
            System.err.println("Invalid price: "+price+"\n Price of Tesla can not be less than 50k");
System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void setYear(int year) {
        if (year<=2008){
            System.err.println("Invalid year: "+year+" Tesla cannot be less than 2008");
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to star "+getMake()+" "+getModel());    }
}
/*
Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  AutoPilot()
 */
