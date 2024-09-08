package day27_accessModifiers;

public class StaticInitializationBlock {
    // Static variables
    public static int a;
    public static double b;
    public static String c;

    // public static ExelSheet sheet;

    // Static Initialization Block
    // we don't use constructor for static variables
    // The best choice for initializing static variables is using a static block.
    static {
        a = 99;
        b = 123.5;
        c = "Java";
        System.out.println("Static Initialization Block executed");
    }
    /*
    public static void main(String[] args) {
        // Overriding values in the main method

        a = 100;
        b = 20.5;
        c = "Java";
    }


    public StaticInitializationBlock() {
        a = 100;
        b = 20.5;
        c = "Java";
    }
    */

}
