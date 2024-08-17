package day03_variables;

public class primitiveDataTypesItro2 {
    public static void main(String[] args) {
      /*Primitives:
        	int: for integer numbers
        	double: for decimal numbers
        	char: for single character ''
            boolean: for True or False expressions
       */
        char a='@';     // u have to check question mark ' "?"
        System.out.println(a);

        //char b='Hola'; accept single character
        char b='4';
        System.out.println(b);
        System.out.println("-------------------------------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("--------------------------------------------------------------");
        char ch3 = 9000;
        System.out.println(ch3);
        char ch4 = 2808;
        System.out.println(ch4);
        char ch5 = 5489;
        System.out.println(ch5);
        System.out.println("----------------------------------------------------------------------");
        int sum ='A'+'B';
        //      65 + 66 = 131
        System.out.println(sum);// 131
        System.out.println("-----------------------------------------------------------------");
        /*

        boolean r1 =123;
        boolean r2 =2.5;
        boolean r3 ="java"

         */
        boolean r4=true;
        boolean r5=false;

        boolean r6= 100>10;//true
        boolean r7=0<-1;// false
        System.out.println(r6);
        System.out.println(r7);

    }
}
