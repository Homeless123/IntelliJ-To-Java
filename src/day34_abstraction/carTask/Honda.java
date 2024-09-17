package day34_abstraction.carTask;

public  class Honda extends Car {
    public Honda( String model, String color, int year, double price) {
        super( model, color, year, price);
    }
    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start "+ getMake() + " " + getModel());
        // Implementing the abstract method
    }

}
/*
2. Create the following subclasses of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						AutoPilot()
 */