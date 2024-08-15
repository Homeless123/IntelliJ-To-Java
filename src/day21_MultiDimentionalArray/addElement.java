package day21_MultiDimentionalArray;

import utillities.ArrayUtility;

import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,70,80};
        int  element= 90;
        int[] new_array = Arrays.copyOf(arr,arr.length+1);
        new_array[new_array.length-1]=element;
        // { 1,2,3,4,5,6}

        System.out.println(Arrays.toString(new_array));
        System.out.println("------------------------------");

        int[] numbers ={100,90,80,70,60};

        numbers =ArrayUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};
        nums = ArrayUtility.addElement(nums,5.5);
        nums = ArrayUtility.addElement(nums,6.5);
        nums = ArrayUtility.addElement(nums,7.5);
        System.out.println(Arrays.toString(nums));
        System.out.println("************************");

        String[] names={"John", "Mike", "Edison"};
        names= ArrayUtility.addElement(names,"James");
        names= ArrayUtility.addElement(names,"Oscar");
        names= ArrayUtility.addElement(names,"Luis");
        System.out.println(Arrays.toString(names));

        System.out.println("*************************");

        char[] alphabet={'A','B','C','D','E','F'};
        alphabet= ArrayUtility.addElement(alphabet,'Z');
        System.out.println(Arrays.toString(alphabet));

    }
}
