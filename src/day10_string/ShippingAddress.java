package day10_string;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012

         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();
        System.out.println("Enter your building number:");
        String buildingNumber = input.next();
input.nextLine();
        System.out.println("Enter your Street name:");
        String street = input.nextLine();
        System.out.println("Enter your city name:");
        String city = input.nextLine();
        System.out.println("Enter your state:");
        String state = input.nextLine();
        System.out.println("Enter your zip:");
        String zip = input.next();



        System.out.println("*********//////////*************");
        System.out.println("Your shipping address");
        System.out.println("\t " + fullName);
        System.out.println("\t " + buildingNumber+",\s"+street);
        System.out.println("\t " + city+",\s"+state+",\s"+zip);

        input.close();


//
//        System.out.println(" Enter your full name");
//        new Scanner(System.in).next();
//        System.out.println("Enter your building number");
//        new Scanner(System.in).nextLine();
//        System.out.println("Enter your Street name");
//        new Scanner(System.in).nextLine();
//        System.out.println("Enter your city name");
//        new Scanner(System.in).nextLine();
//        System.out.println("Enter your state");
//        new Scanner(System.in).nextLine();
//        System.out.println("Enter your zip code");
//        new Scanner(System.in).next();





    }
}
