package day32_finalKeyword.carTask_Overwriting;
/*
Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */

public class Car {
    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels = 4; // Default for cars
    public static boolean hasBattery = true; // Assume all cars have a battery

    // Constructor to initialize all fields
    public Car( String model, String color, int year, double price) {
        setMake(getClass().getSimpleName()); // You can set make to the class name if needed: this.make = getClass().getSimpleName();
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
    static {
        numberOfWheels = 4;
        hasBattery = true;
    }

    // Getter and Setter for 'make'
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    // Getter and Setter for 'model'
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    // Getter and Setter for 'color'
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // Getter and Setter for 'year'
    public int getYear() { return year; }
    public void setYear(int year) {
        if (year <= 0) { // Year cannot be negative or zero
            System.err.println("Year cannot be negative or zero: " + year);
            System.exit(1);
        }
        this.year = year;
    }

    // Getter and Setter for 'price'
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price <= 0) { // Price cannot be negative or zero
            System.err.println("Price cannot be negative or zero: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    // Method to start the car
    public void start() {
        System.out.println("Press the brake and twist the key to ignition "+make+" "+model);
    }

    // toString method to print the car details
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number Of Wheels=" + numberOfWheels +
                ", has Battery=" + hasBattery +
                '}';
    }
}

/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()
 */
