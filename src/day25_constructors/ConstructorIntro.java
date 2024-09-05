package day25_constructors;

public class ConstructorIntro {

    // No-argument constructor
    public ConstructorIntro() {
        System.out.println("Object is created by using no argument constructor");
    }

    // Constructor with an int parameter
    public ConstructorIntro(int a) {
        System.out.println("Object is created by using int argument constructor");
    }

    // A method named add (but it's not used in this example)
    public void add() {
        // Method body is empty
    }

    // Main method: entry point of the program
    public static void main(String[] args) {

        // Creating an object using the int argument constructor
        ConstructorIntro obj = new ConstructorIntro(10);

        // Creating an object using the no-argument constructor
        ConstructorIntro obj2 = new ConstructorIntro();

        //ConstructorIntro obj3 = new ConstructorIntro("Java");

    }
}