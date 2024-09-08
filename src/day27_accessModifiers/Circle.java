package day27_accessModifiers;

public class Circle {
    public double radius;   // Instance variable for radius
    public double diameter; // Instance variable for diameter
    public static double pi = 3.14; // Static variable for the value of pi

    // Constructor to initialize the Circle object with a specific radius
    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;  // Diameter is twice the radius
    }

    /*
    // Example of incorrect static method accessing non-static variable
    public static double calcArea() {
        return radius * radius * pi;
    }
    */

    // Method to calculate the area of the circle
    public double calculateArea() {
        return radius * radius * pi;  // Area formula: π * r^2
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return diameter * pi;  // Perimeter formula: π * d (or 2 * π * r)
    }

    // Static method to print the value of pi
    public static void printPi() {
        System.out.println("PI's value is: " + pi);
    }

    // Overriding toString() method to provide a string representation of the Circle object
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}

/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area, and perimeter of the circle when the object of circle is passed in the print statement
 */
