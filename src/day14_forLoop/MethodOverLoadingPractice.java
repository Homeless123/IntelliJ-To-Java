package day14_forLoop;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {
        System.out.println(sum(10,54));
        System.out.println(sum(40,73,45));
        System.out.println(sum(5,4));
        System.out.println(sum(7,9,8,4,6));
        System.out.println(sum(7.5,4));
        System.out.println(sum(7,7.5,45.48,48,89,0.1));

    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }
    public static int sum(int number1, int number2, int number3){
        return sum(number1,number2)+ number3;
    }
    public static int sum(int number1, int number2, int number3, int number4){
        return sum(number1,number2,number3)+number4;
    }
    public static int sum(int number1, int number2, int number3, int number4, int number5){
        return sum(number1,number2,number3,number4)+number5;
    }
    public static int sum(int number1, int number2, int number3, int number4, int number5, int number6){
        return sum(number1,number2,number3,number4,number5)+number6;
    }
   public static double sum(double number1, double number2){
        return number1 + number2;
   }
   public static double sum(double number1, double number2, double number3){
        return sum(number1,number2)+number3;
   }
   public static double sum(double number1, double number2, double number3, double number4){
        return sum(number1,number2,number3)+number4;
   }
    public static double sum(double number1, double number2, double number3, double number4, double number5){
        return sum(number1,number2,number3,number4)+number5;
    }
    public static double sum(double number1, double number2, double number3, double number4, double number5,double number6){
        return sum( number1,  number2, number3, number4, number5)+number6;
    }
}
