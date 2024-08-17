package Day15_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = input.nextInt();

        while (     !    (age >= 1 && age <= 140)   ) { // while the age is invalid
            System.out.println("Invalid entry ! Please re-enter your age");
            age = input.nextInt();
        }

        if (age >= 18) {
            System.out.println("You are Eligible");
        }else {
            System.out.println("You are not Eligible");
        }
input.close();


    }

}
