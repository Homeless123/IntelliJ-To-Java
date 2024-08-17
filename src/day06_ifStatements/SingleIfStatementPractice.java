package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

       int number = 100;
        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("Even number");
        }
        if (!isEven){
            System.out.println("Odd number");
        }

        System.out.println("--------------");
        int number1 = 123;
        boolean IsEven = number1 % 2 == 0;
        if (IsEven) {
            System.out.println("Even number");
        }
        if (!IsEven){
            System.out.println("Odd number");
        }
        System.out.println("--------------------");

        if (number %2==0){
            System.out.println("even number");
        }
        if (number %2!=0){
            System.out.println("odd number");
        }
        System.out.println("***********************");
        if (number1 %3==0){
            System.out.println("even number");
        }
        if (number1 %3!=0){
            System.out.println("odd number");
        }

    }
}
