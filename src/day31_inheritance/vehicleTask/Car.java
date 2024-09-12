package day31_inheritance.vehicleTask;

public class Car extends Vehicle {
    public Car(String model, int year , String color, double price) {
        super("Car",model,color,year,price);
    }

    public void drive(){
        System.out.println("Driving "+getBrand()+" "+getModel());
    }

}
/*
2. Create a sub class of Vehicle named Car

			Extra methods:
				drive()
 */
