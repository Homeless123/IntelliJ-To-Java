package day19_Array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {
        int [] number = new int[5];

        int [] nums = {10 ,20 ,30 ,40 ,50 }; // Array Literals

        System.out.println(number.length);
        System.out.println(nums.length);


        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("number = " + Arrays.toString(number));

        System.out.println("********************************");


        String[] days = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = 1;

        System.out.println(days[n-1]);

        System.out.println(days[0]);

        System.out.println("********************************");

        String [] month ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        System.out.println(month.length);
        System.out.println("month = " + Arrays.toString(month));

        System.out.println("********************************");


        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }

        int [] numbers2= new int [100];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i;
        }
        System.out.println(Arrays.toString(numbers2));

        System.out.println("********************************");










    }
}
