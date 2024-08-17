package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num+" Even number");
            }else {
                System.out.println(num+" Odd number");
            }
            System.out.println("Would you like to enter another number? (Yes/No)");
            String answer = input.next();

            while (!answer.equals("yes") && !answer.equals("no")){ // while the user provides answer
                System.err.println("Invalid Entry!Would you like to enter another number? (Yes/No)");
                answer = input.next().toLowerCase();

            }

            if (answer.equals("no")){
                break;
            }
        }
input.close();


    }
}
