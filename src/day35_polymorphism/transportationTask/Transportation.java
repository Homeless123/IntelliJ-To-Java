package day35_polymorphism.transportationTask;

public abstract class Transportation {
    private final String make,model;
    private  String color;
    private final int year;
    private  double price;
    // constructor
    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }
    // abstract methods
    public abstract void transportPeople();
    public abstract void start();
    // non-abstract methods
    public void stop() {
        System.out.println("Shut off the engine");
    }
    // getters and setters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // toString method  to display the details of the vehicle
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
/*
1. Create an abstract class named Transpotation
				Variables:
					make (final), model (final), color, year(final), price

				Encapsulate all the fields

				Add a constructor that can set all the fields

				abstract methods:
					transportPeople();
					start();

				non abstract methods:
					stop(): "Shut off the engine"
					toString()
 */