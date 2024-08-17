package day10_string;


import java.lang.String;
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "Hello";


        System.out.println(str.length());

        sc.close();

        System.out.println("**********----------------********************");

        String s1 ="dog";
        String s2 ="cat";

        String s3 ="dog";
        String s4 ="dog";
        System.out.println("*/*/*/*/*/*");

        System.out.println(s2 .equals(s1));// be attention

        System.out.println("/*/*/*/*/*/");
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("/////////////******************/////////////////");
        String  str1 =new String("Java"); // creat 2 object 1. String pool 2. in heap (outside string)
        String str2 =new String("Java");
        System.out.println(str1 == str2);// different not same string

        System.out.println("/////////////******************/////////////////");

        String  str3 ="Python";
        String str4 =new String("Python");
        String str5 =new String("Python");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str5==str4);
        System.out.println(str5 .equals(str4));






    }
}
