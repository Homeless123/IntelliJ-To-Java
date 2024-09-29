package day37_exceptions;

public class TryCatchBlock2 {

    public static void main(String[] args) {

        System.out.println("Program1 Starting");
        int [] arr = {1,2,3};

        try {
            System.out.println(arr[1000]);
        }catch (ArrayIndexOutOfBoundsException e){
           // e.printStackTrace(); // display full details of the exception after the execution of program
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        System.out.println("Program1 Ending ");

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        System.out.println("Program2 Starting");

        try {
            System.out.println(9/0);

        }catch (ArithmeticException e){
           // e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        System.out.println("Program2 Ending");

    }

}
