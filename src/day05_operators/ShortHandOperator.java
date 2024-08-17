package day05_operators;

import java.util.jar.JarOutputStream;

public class ShortHandOperator {
    public static void main(String[] args) {

        int a=20;
        System.out.println("a = " + a);
        System.out.println(a);

        a = 40 ;
        System.out.println("a = " + a);
        System.out.println(a);

        a=90;
        System.out.println(a);
        System.out.println("------------------------------------");

        double balance=100;

        balance+=1000; // balance 100+1000 or old to add new
        System.out.println("balance = " + balance);
        balance+=500;// 1100+500
        System.out.println("balance = " + balance);
        balance+=200;//1600+200
        System.out.println("balance = " + balance);

        balance-=1500;//1800-1500

        System.out.println("balance = " + balance);


        System.out.println("----------------------------------------------");

        double salary=2400;
        salary *=2;
        System.out.println("salary = " + salary);

        salary *=3;
        System.out.println("salary = " + salary);
        System.out.println("----------------------------------------------------");

        double eth=4;
        eth *=250;

        System.out.println("eth = " + eth);

        eth /=2;
        System.out.println("eth = " + eth);

        System.out.println("---------------------------------------------------");

        System.out.println("salary = " + salary);
        salary /=2;
        System.out.println("salary = " + salary);

        int b =39;
        b %=7;
        System.out.println("b = " + b);



    }
}
