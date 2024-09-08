package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {
        // Accessing and printing static variables from StaticInitializationBlock class
        new StaticInitializationBlock();
        System.out.println("a: " + StaticInitializationBlock.a);
        System.out.println("b: " + StaticInitializationBlock.b);
        System.out.println("c: " + StaticInitializationBlock.c);
    }
}
