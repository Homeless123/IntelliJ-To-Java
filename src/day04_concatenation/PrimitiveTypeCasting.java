package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //------Implicit Casting-------\\

        // larger tan smaller automatically

        byte a =23;
        short b= a;
        //short b = (short) a;
        System.out.println(b);

        int c= a; // implicit casting
        long d = 3000l;
        float f = d ;
        System.out.println(f);

        //----------Explicit Casting -------\\

        // smaller than larger u did your self

        int x = 100;
        byte y = (byte)x;
        System.out.println(y);
        float z =(float)20.8f;
        System.out.println(z);
        short q =(short) z;
        System.out.println(q);
        double n1=2.5;
        byte n2= (byte) n1;
        System.out.println(n2);
        System.out.println("---------------------------------");
        int num =500;
        byte result=(byte)num;
        System.out.println(result);
        int r=50000;
        short t =(short)r;
        System.out.println(t);
        double u = 3123.23;
        int hx= (int)u;
        System.out.println(hx);
        int d1= 100;
        double d2= d1;
        System.out.println(d2);




    }
}
