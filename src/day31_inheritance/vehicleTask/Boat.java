package day31_inheritance.vehicleTask;

public class Boat extends Vehicle {
    public Boat( String model, String color, int year, double price) {
        super("Boat", model, color, year, price);
    }
    public void sail(){
        System.out.println("Sailing "+getBrand()+" "+getModel());
    }
}
/*
Create a sub class of Vehicle named Boat

			Extra methods:
				sail()
 */
