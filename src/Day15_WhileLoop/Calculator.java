package Day15_WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        double num2 = input.nextInt();

        System.out.println("Enter a Math operator");
        char operator =input.next().charAt(0);


        while ( !( operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.println("Invalid operator! Please try again: ");
            operator = input.next().charAt(0);
        }

        if (operator=='+'){
            System.out.println(num1+num2);
        }else if (operator=='-'){
            System.out.println(num1-num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        }else if (operator=='/'){
            System.out.println(num1/num2);
        }




    }
}
