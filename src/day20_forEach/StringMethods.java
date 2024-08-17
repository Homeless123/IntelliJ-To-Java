package day20_forEach;

import utillities.ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str= "Cydeo School";

        char[] ch =str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("---------------------------------");

        String str1= "Todays is a great day to learn java";

        String[] word = str1.split(" ");
        System.out.println(Arrays.toString(word));

        System.out.println("---------------------------------");

        String sentence ="Today is great day to learn java";
        String[] arr= ArrayUtility.reverse(sentence.split(" "));    // [ i , love java]
        System.out.println(Arrays.toString(arr));

        String reverseSentence="";
        for (int i = 0; i < arr.length; i++) {
            reverseSentence+= arr[i]+" ";
        }
        System.out.println(reverseSentence);
            
        }





    }

