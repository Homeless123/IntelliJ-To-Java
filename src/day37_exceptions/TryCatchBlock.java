package day37_exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 starting");
        try {
            System.out.println(9 / 0); //ArithmeticException
            System.out.println("Try Block");
        }catch (Exception e){
            System.out.println("Catch caught");

        }

        System.out.println("Program1 ending");


        System.out.println("---------------------------------");

        System.out.println("Program2 Starting");

        String str = null;

        try {
            System.out.println("str.toLowerCase() = " + str.toLowerCase());
            System.out.println("Try Block");
        }catch (RuntimeException e) {
            System.out.println("Catch caught");
        }

        System.out.println("Program2 Ending");

        System.out.println("---------------------------------");

        System.out.println("Program3 Starting");

        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        }catch (InterruptedException e){
            System.out.println("Catch caught"+e.getMessage());
        }

        System.out.println("Program3 Ending");



    }

}
