package Day15_WhileLoop;
import java.util.*;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            int num = input.nextInt();

            if (num < min) {  // if the user entered entry is less than current minimum number that we have
             min = num;       // then user entered number should be the minimum number
            }

        }
        System.out.println("Minimum number is: " + min);
         input.close();
    }

}
