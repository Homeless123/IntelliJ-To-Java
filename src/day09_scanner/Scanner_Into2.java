package day09_scanner;

import java.util.Scanner;

public class Scanner_Into2 {
    public static void main(String[] args) {
        /*
        1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number");
        float decimal = input.nextFloat();

        System.out.println("Enter your second decimal number");
        double decimal2 = input.nextDouble();

        System.out.println("Enter true or false ");
        boolean bool = input.nextBoolean();


        System.out.println("decimal = " + decimal);
        System.out.println("decimal2 = " + decimal2);
        System.out.println("bool = " + bool);

    }
}
