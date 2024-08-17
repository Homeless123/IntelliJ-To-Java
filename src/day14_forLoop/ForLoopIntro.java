package day14_forLoop;

public class ForLoopIntro {
    public static void main(String[] args) {
        System.out.println("Ahmet Cemal");


        System.out.println("--------------");

        for (int i = 10; i >= 5;i-- ) { //i: 10.9.8.7.6.5
            System.out.println("Hello World "+i);//1.2.3.4.5.6
        }// its printing 6 time bc of
        System.out.println("Cydeo");

        System.out.println("----------------");
        // sum of all the number 1~100

        int sum = 0;

                for (int i =1 ; i <=100 ; i++  ) {
                    sum += i;



                }
                System.out.println(sum);
        System.out.println("/////////");

        // print all the alphabet A~Z
        for (char i ='A'; i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("IDFWU");

        // Print all the alphabet letters in backwards Z~A

        for (char i='Z';i >='A';i--){
            System.out.print(i+" ");
        }





    }


}
