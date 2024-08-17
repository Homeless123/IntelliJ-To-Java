package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    /*
    1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first=input.nextLine().trim().replace( " ","");
        System.out.println("Enter your last name");
        String last=input.nextLine().trim().replace(" ","");
        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last= last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String fullName=first+" "+last;
        input.close();

        System.out.println("Your fullname = "+fullName);





    }}