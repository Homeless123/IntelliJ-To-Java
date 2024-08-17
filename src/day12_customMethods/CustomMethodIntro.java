package day12_customMethods;
/*
1. void method
2. parameters
3. return method
4. return with parameters
5. method overloading
 */
public class CustomMethodIntro {
    public static void greeting(){
        System.out.println("Hello World");
        System.out.println("How are you today");
        System.out.println("Are you ready to learn java");
/*
don't have to creat inside to void giving error
 */

    }

    public static void main(String[] args) {

        System.out.println("Test started");

       greeting();


        System.out.println("Test complicated");
        System.out.println("---------------------------");
        displayMessage();


    }
    public static void displayMessage(){
        System.out.println("1 2 3 4 5 6 7 8 9");
        System.out.println("Hello World");
    }



}
