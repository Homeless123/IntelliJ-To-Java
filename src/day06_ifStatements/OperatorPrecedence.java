package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3 );

        System.out.println( 7 + 3 - 2 / 2 );

        System.out.println(-5+2);

        System.out.println(10 > 9 == 8 < 7 && "java"=="python"|| 'a'=='A');

        System.out.println(100>=20&&40*2>60);
        // first * is 40*2 = 80
        //second > is 100>=20 is TRUE bc of ist same and writing firts
        // 3.th is 80 >60 is  TRUE
        //4.th is &&
        int a = 20;
        a +=10 + 2 *3;
        System.out.println(a);

    }

}
