package day06_ifStatements;

public class IdentifyNumber {
    /*
     Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

     */

    public static void main(String[] args) {

        int number =200;

        boolean isPositive=number > 0 ;// if the num is greater than 0 , so positive num
        boolean isNegative=number < 0 ;// if the num is less than 0 , so negative num
       // boolean isZero=number == 0 ;//  if the num is equal  0 , so zero num
        boolean isZero =!isPositive && !isNegative ;// if the num not positive and negative is zero

        System.out.println(number+" is positive number: "+isPositive);
        System.out.println(number+" is negative number: "+isNegative);
        System.out.println(number+" is zero number: "+isZero);

    }
}
