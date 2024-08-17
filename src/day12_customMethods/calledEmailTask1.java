package day12_customMethods;

import java.util.Scanner;

public class calledEmailTask1 {
    /*
    Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
     */
    public static void main(String[] args) {
        Scanner inoput = new Scanner(System.in);
        System.out.println("Enter email address");
        String email = inoput.nextLine();
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.lastIndexOf("@"));
        String address = email.substring(email.lastIndexOf("@")+1);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("rest "+address);
        email = firstName + "_" + lastName+"@"+address;
        System.out.println(email);





            }
}
