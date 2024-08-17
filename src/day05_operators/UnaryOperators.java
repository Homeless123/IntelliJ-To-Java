package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        //----Pre increment/Decrement----\\
        //change immaterially

        int x= 10;
        System.out.println(++x);//11
        System.out.println(x);

        int y =100;
        System.out.println(--y);//99
        System.out.println(y);

        //----Post Increment7Decrement----\\
        // not change immediately

        double a = 45;
        System.out.println(a++);//50
        System.out.println(a);

        int b = 25;
        System.out.println(b--);
        System.out.println(b);


        System.out.println("---------------------");
        int n=30;
        int m=n++;
        System.out.println("n="+n);
        System.out.println("m="+m);
        System.out.println("----------------------------------------");

        int z=60;
        int q=z--;
        System.out.println("z= "+z);
        System.out.println("q= "+q);



    }
}
