package day12_customMethods;

import java.util.Scanner;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        maxNumber(103.5,485.98);
        System.out.println("//////////////////////////");
        maxNumber(78,78);
        System.out.println("-------------------");
        maxNumber(48,13);
        System.out.println("-------------------");
        initial("Ahmet ","Cemal");
        System.out.println("-------------------");
        initial("Mustafa","Kemal");
        System.out.println("-------------------");
        initial("Fener","Bahce");
    }
    public static void maxNumber(double num1, double num2){

       if(num1 > num2){
           System.out.println(num1+" is greater than "+ num2);
       } else if (num2>num1) {
           System.out.println(num2+" is greater than "+ num1);
       }else {
           System.out.println(num1+" is equal to "+num2);
       }


    }
    public static void initial (String firstName, String lastName){
       String initial = firstName.charAt(0)+"."+lastName.charAt(0);
       System.out.println("initial = "+initial);
       // System.out.println(firstName.toUpperCase()+"."+lastName.toUpperCase());
    }
}
