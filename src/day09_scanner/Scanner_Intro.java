package day09_scanner;
// import java.util.*;
import java.util.Scanner;

public class Scanner_Intro {
    /*
    import statement: used for importing one java file to another

        regular import: imports one single class from the specified package   1
            import package.className

        wild import: imports everything from the package    2+
            import package.*;

     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter a number: ");


        byte num1 =input.nextByte();
        System.out.println("Enter your First number: "+num1);

        short num2 =input.nextShort();
        System.out.println("Enter your Second number: "+num2);

        int num3 =input.nextByte();
        System.out.println("Enter your Third number:  "+num3);

        long num4 =input.nextLong();
        System.out.println("Enter your Fourth number: "+num4);

        input.close();

        // after the close don't be write

//        int num5 =input.nextInt();
//      System.out.println("Enter your Fifth number: "+num5);

        System.out.println("num4 = " + num4);
        System.out.println("num3 = " + num3);
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);










    }
}
