package day26_statics;

public class Car {
    public String make;
    public String model;
    public int year;
    public double price;
    public String color;

    // 1st constructor: initializes the make ONLY
    public Car(String make) {
        this.make = make;
    }

    // 2nd constructor: initializes make & model (uses constructor chaining)
    public Car(String make, String model) {
        this(make); // Calls the first constructor to initialize the make
        this.model = model;
    }

    // 3rd constructor: initializes make, model, and year (uses constructor chaining)
    public Car(String make, String model, int year) {
        this(make, model); // Calls the second constructor to initialize make and model
        this.year = year;
    }

    // 4th constructor: initializes make, model, year, and price (uses constructor chaining)
    public Car(String make, String model, int year, double price) {
        this(make, model, year); // Calls the third constructor to initialize make, model, and year
        this.price = price;
    }

    // 5th constructor: initializes all the fields (uses constructor chaining)
    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price); // Calls the fourth constructor to initialize make, model, year, and price
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
class name: Car
		 instance variables:
		 		make, model, year, price, color

	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: intializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)
 */
