package Day15_WhileLoop;
/*
Write a program that can be remove duplicated characters from a string
    Ex:
        str="aabbbcccc"
        output:
        abc

 */

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "ahmet cemal ozdemir";

        String renew ="" ; //"abc"

        for (int i = 0; i < str.length()-1; i++) { // i: index number of giving str
          //  System.out.print(str.charAt(i));
            char each = str.charAt(i); // each character of the String
            if (!renew.contains( "" + each)){ // if string renew doesn't contain the character of string yet
                renew += each; // hen we will add the character to string renew

            }
                // if the character is not contained yet in the new string, then we will add it to the new string
        }

        System.out.print(renew);



    }

}
