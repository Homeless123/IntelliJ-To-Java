package day21_MultiDimentionalArray;

import java.util.*;

/*
Write a  function that check if a string is build out of the same letters as another string. (anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false
 */
public class anagram {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

       // String[] a1 = str.split("");
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println("--------------");
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));        //[a, e, h, r, t]
        System.out.println(Arrays.toString(a2));        //[a, e, h, r, t]

        boolean isAnagram = Arrays.equals(a2, a1);
        System.out.println("isAnagram = " + isAnagram);
    }


    }

