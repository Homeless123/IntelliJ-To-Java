package day34_abstraction.carTask;

public class Audi extends Car  {
    public Audi( String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Turn the key to ignition to start " + getMake() + " " + getModel());
    }
    public final void autoPark() {
        System.out.println("Park the car with the help of the built-in auto-parking system " + getMake() + " " + getModel());
    }
}
