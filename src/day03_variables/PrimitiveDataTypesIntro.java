package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        //dataType and variableName= Data;
        //byte a = "Java"; // byte only accept integer values (-128 to 127)
        // byte a = 20.5;  // byte can not take decimal numbers
        //byte a = 2000;   // also past 127
        byte a = 20;

        // price of the car is 49,218 Euro
        short p = 17500;
        System.out.println("p" + "\n" + p);
        // or
        System.out.println("p");
        System.out.println(p);
        // salary 95 k
        int s = 95000;
        System.out.println(s);
        //int n = 9000000000l; //not giving bc of passing number
        long n = 9000000000l;// or long n = 9000000000l;
        System.out.println(n);
        float q = 9000000000f;// also giving f so u can use l and f
        System.out.println(q);
        float w = 9000000000f;
        System.out.println(w);
        //gpa is 3.5
        double gpa1 = 3.5;
        float gpa2 = 3.5f; // if u write f or l giving
        System.out.println(gpa1 +"\n"+ gpa2);


    }
}
/*
Java Programming Day03

Topics: Variables Intro
		Primitive Data types

Package name: day03_variables

warmup tasks:
	1. Make sure you have created "GitHub" & "Repl.it" Accounts

	2. Make sure you already joined "Zero to Hero JDB1" repl.it team

	3. Create a Java file named EscapeSequencesPractice.java
			1.1 Write a program that can display the following message:

			Output:
				 	My Favorite programming language is "Java"
				 		Java is an "Object-Oriented" programming language.

	 		Note: do not use more than one print statement


Numbers:
	Integer Numbers: byte, short, int, long

	Decimal numbers: float, double




String: for text ""

declaring variable:
		DataType variableName = Data

variable naming rules:
		1. readable, understandable, and meaningful
		2. must be UNIQUE
		3. camel case
		4. can not have special characters other than _ and $
		5. can not start with digits
		6. can not be java reserved words
 */