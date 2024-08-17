package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        /*
        Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"
         */

        String str= new Scanner(System.in).nextLine();

        if (str.length() >=1){ // if String has 1 character
            char firstChar = str.charAt(0);
           // System.out.println("".charAt());
            if(firstChar >= 48 && firstChar <= 57){
                System.out.println("First char is digit");
            }else if (firstChar >= 'A' && firstChar <= 90){
                System.out.println("First char is uppercase letter");
            }else if (firstChar >= 97 && firstChar <= 'z'){
                System.out.println("First char is lowercase letter");
            }else {
                System.out.println("First char is special character");
            }
        }else {
            System.out.println("String is empty");
        }



}}
