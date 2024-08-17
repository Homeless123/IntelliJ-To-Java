package day05_operators;

import java.awt.desktop.AboutEvent;

public class RelationalOpererators {
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
        //System.out.println( a > b);
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);
        System.out.println("-------------------------------");
       int score =55;

       boolean passed =score >= 60;

        System.out.println(passed);

        System.out.println("-------------------------------");
    int age = 19;
    boolean eligibleToBuyAlcohol = age > 21;
        System.out.println(eligibleToBuyAlcohol);
    boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println("-------------------------------");

        System.out.println(100 >100 );// false
        System.out.println(100 >=100 );// true
        System.out.println(100>=185);

        System.out.println("-------------------------------");

        score =48;
        boolean failed = score <60;
        System.out.println(failed);

        System.out.println("----------*/*/*/*/*/---------------------");

        System.out.println(100< 2000);//true
        System.out.println(100<25);

        System.out.println("----------*/*/*/*/*/---------------------");

        System.out.println(95 <= 100);//true

        System.out.println(100<=100);
        System.out.println( 10 <= 5);

        System.out.println("----------*/*/*/*/*/---------------------");

        System.out.println('A'>'a');// false

        //System.out.println("Java"<="C++");








    }
}
