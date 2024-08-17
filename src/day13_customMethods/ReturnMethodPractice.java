package day13_customMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        System.out.println(isOdd(100));
        int num = 200;
        if (isOdd(num)) {
            System.out.println(+num+" is Odd number");
        }else {
            System.out.println(+num+" is Even number");
        }

    }
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static boolean isEven(int n) {
        return !isOdd(n);
        // return n % 2 == 0
    }
    public static int max(int a, int b) {
      //  return a > b ? a : b ;
       if (a >b){
           return a;
       }else {
           return b;
       }

    }
}
