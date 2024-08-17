package Day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483646; // Any integer number that user enter will ALWAYS be greater than
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }

        }
        System.out.println("The maximum number is " + max);
        input.close();
    }
}
