package day09_scanner;

import java.util.Scanner;

public class Scanner_Intro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        //char ch = input.next().charAt(0);
        //System.out.println("You entered " + ch);

        System.out.println("Would you like to continue");
        String answer = input.nextLine() ; // you can write more words

        //String answer = input.next(); // only 1 word

        System.out.println("You have entered ;" + answer);



    }
}
