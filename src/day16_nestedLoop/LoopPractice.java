package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("hello = " + i);
        }
        System.out.println("---------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world = " + i);
        }
        System.out.println("---------------");
        int j = 0;
        while (j <5){
            System.out.println("hello java = " + j);
            j++;
        }
        System.out.println("-----------------");

        int k = 0;
       do {
           System.out.println("hello cydeo = " + k);
           k++;
        }while (k<5);
        System.out.println("--------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");

        int score = input.nextInt();

        while (score>100 || score<0){ // while the score is invalid
            System.out.println("Invalid score, please re-enter your score again");
            score = input.nextInt();
        }

        if (score >= 60) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }



    }
}
