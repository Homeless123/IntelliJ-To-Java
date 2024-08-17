package day22_ArrayList;

public class WrapperCalssesIntro {

    public static void main(String[] args) {
        String str = "Java";
        int a1=10;
        Integer a2=10;
        System.out.println("--------------------");

        int b1=100;
        long b3=b1;
        double b4=b1;
        Integer b2=b1; // auto boxing
        //Long b3=(long)b1;
        //Double b4=b1;
        char ch='A';
        //String ch1=ch;
        Character ch2=ch;
        double d1= 5.5;
        Double d2=d1; // auto boxing
        System.out.println("************************");

        Integer n1 = 10;   // Declare and initialize n1  ====**** unboxing
        int n2 = n1;       // Convert n1 to primitive int and assign to n2
        long n3 = n1;
        double n4 = n1;
          //    int n1=n5; 1.st have to new element if it not giving to error
        Character e1='Z';
        char e2=e1; // unboxing
        double d3=d1;
        Double d4=d1;






    }
}
