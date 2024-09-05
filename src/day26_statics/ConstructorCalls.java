package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(); Constructor can not call or contain itself
        System.out.println("Default Constructor Call");
    }
    public ConstructorCalls(int a){
        //Constructor Calls:
        //		1. Constructors can not be called by its name ( this() need to be used)
        //		2. Only a constructor can call another constructor
        //		3. Constructor call MUST be at the first step
        //		4. One constructir can not call more than one constructor
        //		5. Constructor can not call or contain itself
        this();

        System.out.println(" Constructor Call with int argument");
        //this();  Constructor call MUST be at the first step
    }
    public ConstructorCalls(double b){
        this();
        System.out.println(" Constructor Call with double argument");
    }
    public ConstructorCalls(String s){
        this();
        //this(2.5):One constructir can not call more than one constructor
        System.out.println(" Constructor Call with String argument");

    }

    public static void main(String[] args) {
        method1();
        System.out.println("-----------------");
        method2();
        new ConstructorCalls();        // Calls the default constructor
        System.out.println("-----------------");
        new ConstructorCalls(10);       // Calls the constructor with int argument
        System.out.println("-----------------");
        new ConstructorCalls(5.5);      // Calls the constructor with double argument
        System.out.println("-----------------");
        new ConstructorCalls("Test");   // Calls the constructor with String argument

    }
    public static void method1(){
        //ConstructorCalls();
        //this(); Only a constructor can call another constructor
        System.out.println("method1");
    }
    public static void method2(){
        method1();
        System.out.println("method2");
    }
}
