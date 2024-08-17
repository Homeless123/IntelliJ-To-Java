package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        /*
        1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


         */

        int number=75;

        boolean isEven= number % 2 == 0; //When u divide a num by 2 , if the remainder is 0 , means the num is even

       // boolean isOdd= number % 2 != 0;//When u divide a num by 2 , if the remainder is NOT 0 , means the num is even

        boolean isOdd= !isEven;// if the number is not eve , then it's odd

        System.out.println(number+" is a even number: "+isEven);
        System.out.println(number+" is an odd number: "+isOdd);

        System.out.println("-----------------------------");



        int number1=100;

        boolean IsEven= number1 % 2 == 0; //When u divide a num by 2 , if the remainder is 0 , means the num is even

        boolean IsOdd= number % 2 != 0;//When u divide a num by 2 , if the remainder is NOT 0 , means the num is even///boolean IsOdd= IsEven;
        System.out.println(number1+" is a even number: "+IsEven);
        System.out.println(number1+ " is a odd number: "+IsOdd);

    }
}
