package day19_Array;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int [] numbers = {100,20,500,40,-10,30};

        int max = numbers[0];
        int min = numbers[0];
        int max2 = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > max) { // compares the elements of the array with current maximum number
               max = numbers[i]; // replace the current maximum number
           }
            if (numbers[i] < min) { // compares the elements of the array with current minimum number
                min = numbers[i]; // replace the current maximum number
            }
            if (numbers[i] > max2 && numbers[i]<max) { // compares the elements of the array with current 2.nd max. number
                max2 = numbers[i]; // replace the current maximum number
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("max1 = " + max2);

    }
}
