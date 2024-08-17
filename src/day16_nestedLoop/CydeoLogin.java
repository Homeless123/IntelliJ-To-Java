package day16_nestedLoop;
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */

import java.util.*;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = input.next();

        System.out.println("Enter your password: ");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){  // if the correct
            System.out.println("You have successfully logged in!");
        }else {  // not correct
            System.err.println("You have unsuccessfully logged in!");

        for (int i = 0; i < 3; i++) {
            if (i !=2){
                System.err.println("Incorrect username or password, please try again");
            }else {
                System.err.println("This is your last attempt, Please re-enter your username and password");
            }



            System.out.println("Enter your username: ");
            u = input.next();
            System.out.println("Enter your password: ");
            p = input.next();

            if (u.equals("Cydeo") || p.equals("WoodenSpoon")){
                System.out.println("You have successfully logged in!");
                break; // exits the loop
            }
        }

        if (!u.equals("Cydeo") && !p.equals("WoodenSpoon")){
            System.err.println("Incorrect username or password, your account doesn't exist!, please contact support team");
        }

    }
        input.close();
}


}



