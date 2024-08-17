package day03_variables;

public class varibels_nameing_rules {

    public static void main(String[] args) {
       // age of the student is 30
        // salary is 100k

        int age =30;
        int salary = 100000;
       // int age =28; * not be same
        int phone_number = 911;//but if u write
        int PhoneNumber = 911;// not readable * Camel Case
        int phonenumber = 911; // don't do it

        double SalaryBeforeTax = 100000.05;
        double SalaryAfterTax = 80000.00;
        System.out.println("---------------------------------------------------------------" );

        int number = 10; // can not start with number
        int number1 = 20;// int 1number = 20; wrong
        int number2 = 30;

        /*
        variable naming rules:
		1. readable, understandable, and meaningful
		2. must be UNIQUE
		3. camel case
		4. can not have special characters other than _ and $
		5. can not start with digits
		6. can not be java reserved words
         */

        System.out.println("--------------------------------------------------");

        String gender = "male";
        String FullName= "Ricordo Quaresma";

        System.out.println(gender);
        System.out.println(FullName);
    }
}
