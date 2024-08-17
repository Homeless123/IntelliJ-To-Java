package day10_string;

import java.util.Scanner;

public class StringMethods01 {
    public static void main(String[] args) {
        String str = "Hello¡";
        // index   : 0123456
        
        char firstChar = str.charAt(0);
        char firstChar1 = str.charAt(1);
        char firstChar2 = str.charAt(2);
        char firstChar3 = str.charAt(3);
        char firstChar4 = str.charAt(4);
        char firstChar5 = str.charAt(5);


        System.out.println("firstChar = " + firstChar);
        System.out.println("firstChar7 = " + firstChar1);
        System.out.println("firstChar8 = " + firstChar2);
        System.out.println("firstChar9 = " + firstChar3);
        System.out.println("firstChar10 = " + firstChar4);
        System.out.println("firstChar11 = " + firstChar5);

        System.out.println("----------******************-----------------");

        String sentence ="Java Programming Language for Java";

        int length=sentence.length();
        System.out.println(length);
        int lastlength=length-1;
        System.out.println(lastlength);

        System.out.println("********////////////////**************/////////////**********");

        String st1="Wooden Spoon";
        char f=st1.charAt(0);
        int lastIndexName=st1.length()-1;
        char l = st1.charAt(lastIndexName);
        System.out.println("last word = " + l);
        System.out.println("first word = " + f);

        System.out.println( l + " : "+ f );

        System.out.println("+++++++++++////////////////+++++++++++++++++++");

        String name1="Quaresma";
        String name2 =new String("Quaresma");


        System.out.println(name1.equals(name2)); // true
        System.out.println(name1==name2); // false
        System.out.println("*********************//////////////////////////***************************");

        String q1="Quaresma";
        String q2="Quaresma";
        String q3=new String("Quaresma");

        System.out.println(q1==q2);// true
        System.out.println(q1==q3);// false
        System.out.println(q2==q3);// false
        System.out.println(q1.equals(q2));
        System.out.println(q1.equals(q3));
        System.out.println(q3.equals(q2));

        System.out.println("//////////******************////////////");

        Scanner sc=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Are you USA citizen ? yes / no");
        String anwer=sc.next();

       // if(age>=18 && anwer=="yes"){  giving to else methods telling us incorrect

        if(age>=18 && anwer.equals("yes")){// or you can use .equalsIgnoreCase
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Eligible to vote");
        }



//        int length1=st1.length();
//        System.out.println(length1);


    }}
