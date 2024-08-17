package Day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {

            if (i==1){ // this is jumps
                continue;
            }

            System.out.println(i);
        }
        System.out.println("------------------");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0){ // if i si even
                continue;    // skip the current iteration
            }
            System.out.println(i);
        }

        System.out.println("------------");

        for (char i = 'A'; i <='G' ; i++) {
            if ( i =='B')
                continue;

            if (i=='E')
                continue;
            System.out.println(i);
        }
        System.out.println("------------");

        for (char i = 'a'; i <='g' ; i++) {
            if ( i =='b' || i =='e') // if ( i =='b' && i =='e') if u use && it can not be skip
                continue;

            System.out.print(i);
        }

        System.out.println("***********");
        for (char i = 'A'; i < 'G'; i++) {
            if (i =='A' && i == 'D'){    // its not passing A and G its writing

                continue;


            }
            System.out.println(i);
        }
        System.out.println("*--*-*-*-*-*-*-*-*-*");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Java");
        }




    }


}
