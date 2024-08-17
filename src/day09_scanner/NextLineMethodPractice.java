package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your school name: ");
        String school = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();// we have to give extra nextline () if we are using others methods of scanner

        System.out.println("Enter your street name: ");
        String street = input.nextLine();



    }
}
