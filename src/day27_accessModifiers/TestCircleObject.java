package day27_accessModifiers;

public class TestCircleObject {
    public static void main(String[] args) {
        // Creating the first Circle object with a radius of 3.5
        Circle circle1 = new Circle(3.5);
        System.out.println(circle1); // Printing details of circle1

        System.out.println("\n------------------------------------");

        // Creating the second Circle object with a radius of 5
        Circle circle2 = new Circle(5);
        System.out.println(circle2); // Printing details of circle2

        System.out.println("\n------------------------------------");

        // Creating the third Circle object with a radius of 7
        Circle circle3 = new Circle(7);
        System.out.println(circle3); // Printing details of circle3

        System.out.println("\n------------------------------------");

        // Printing the static pi value using the class name
        System.out.println("PI value accessed via Circle class: " + Circle.pi);

        // Uncommenting the following line will cause an error since radius is an instance variable
        // System.out.println(Circle.radius);
    }
}
