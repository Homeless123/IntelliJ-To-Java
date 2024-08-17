package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(78);
        eligible(17);
        eligible(180);
        eligible(19);
        multiplication(8,9);
        multiplication(9,78);
        System.out.println("---------------");
        System.out.println("Test1 Started");
        boolean exit = true;
        if (exit){
            return;
        }
        System.out.println("Test2 Started");
        System.out.println("Test3 Started");


    }

    public static void eligible (int age){
        if (age < 0 || age > 150){
            System.out.println("Invalid age = "+age);
            return;
            // if age is invalid, then this gets terminated

        }
        if (age >= 18 ){
            System.out.println("You are eligible to buy alcohol = "+age);
        }else {
            System.out.println("You are not eligible to buy alcohol = "+age);
        }

    }
    public static int multiplication (int a, int b){
        int result = a*b;
        System.out.println(result);
        return result;

    }
}
