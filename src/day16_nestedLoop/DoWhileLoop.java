package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition; ) {
            System.out.println("Hello World");
        }
        System.out.println("---------------");
        while (condition) {
            System.out.println("Hello World --------- While Loop");
        }
        System.out.println("---------------");
        do {
            System.out.println("Hello World --------- Do & While Loop");
        }while (condition);

    }
}
