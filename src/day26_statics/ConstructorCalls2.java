package day26_statics;

public class ConstructorCalls2 {

    // Default Constructor
    public ConstructorCalls2() {
        System.out.println("Default Constructor Call");
    }

    // Constructor with an int parameter
    public ConstructorCalls2(int x) {
        this(); // Calling the default constructor
        System.out.println("Int Constructor Call");
    }

    // Constructor with a String parameter
    public ConstructorCalls2(String y) {
        this(10); // Calling the constructor with an int parameter
        System.out.println("String Constructor Call");
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        ConstructorCalls2 obj1 = new ConstructorCalls2();
        System.out.println("-------------------------------");

        // Creating an object using the constructor with an int parameter
        ConstructorCalls2 obj2 = new ConstructorCalls2(10);
        System.out.println("-------------------------------");

        // Creating an object using the constructor with a String parameter
        ConstructorCalls2 obj3 = new ConstructorCalls2("A");
    }
}
