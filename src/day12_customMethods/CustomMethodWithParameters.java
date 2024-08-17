package day12_customMethods;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        //oddOrEven(78);

        int num1 =100,
                num2=25,
                num3=74,
                num4=39;
        oddOrEven(num1);
        oddOrEven(num3);
        oddOrEven(num4);
        oddOrEven(num2);
    }

    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println("Is even number = " + number);
        }else {
            System.out.println("Is odd number = " +number);
        }
    }
}
