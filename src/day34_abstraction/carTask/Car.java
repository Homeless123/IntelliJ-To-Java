package day34_abstraction.carTask;

public abstract class Car {// meat to be inherited, can not be instantiated
    private final String make;
    private final String model;
    private  String color;
    private final int year;
    private  double price;

    public Car( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName() ; // to set the class name to the make of the car
        this.model = model;
        setColor(color);
        if (year < 1886 ){
            System.err.println(year+" can not be less than 1886. Setting year to 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println(price+" can not be negative or zero. Setting price to 0");
            System.exit(1);
        }
        this.price = price;
    }
    protected final void stop (){// to make sure that non-sub classes outside the package cannot override this method
        System.out.println("Press the brake to stop"+make + " " + model);
    }
    protected abstract void start();// meant to be overridden by subclasses

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price= €" + getPrice() +
                '}';
    }

}
/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

 */