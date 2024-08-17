package Day15_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age ");

        int age = input.nextInt();

        while (     !(age >= 1 && age <= 125)       ) {
            System.err.println("Invalid Entry, Please re-enter your age ");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen ?  YES/NO");
        String answer = input.next();


        while (     !(answer.equalsIgnoreCase("YeS")    ||       answer.equalsIgnoreCase("nO")    )){
            System.out.println("Invalid Entry, Please re-enter...");
            System.out.println("\"Are you a US citizen ?  YES/NO\"");
            answer = input.next();
        }

        if (age>=21 && answer.equalsIgnoreCase("yes")){
            System.out.println("You are Eligible to vote");
        }else {
            System.out.println("You are not Eligible to vote");
        }

    }
}
