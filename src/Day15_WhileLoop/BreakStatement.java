package Day15_WhileLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if ( i == 6){   // if i ' s value reach 6
                break;  // exit the loop
            }

            System.out.println(i);

        }
        System.out.println("-------------");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i); // if you write before you can print J
           // System.out.println(" Java "); // u can write anything before the break not after bc of giving error
            if (i == 'J'){
                break;
             //    System.out.println(" java ");  // u can't write after the break
            }
           // System.out.println(i);    after the
        }
        System.out.println("***********");

for (;;){
    System.out.println("I love you ");
    break;
}
    }
}
