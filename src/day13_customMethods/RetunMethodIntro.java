package day13_customMethods;

public class RetunMethodIntro {
    public static void main(String[] args) {
//int total =sum(40,2);// sum is a valid method, does not return any data
     int total =   addition(10,20);
square(0);
        System.out.println(square(99));
        cube(0);
        System.out.println(cube(69));

    }
//    public static void sum(int a,int b) {
//        int sum = a+b;
//
//    }


    public static int addition(int n1, int n2) {
        int result= n1 + n2;
        return result;
    }
    public static int square(int num) {
        int square= num*num;
        return square;

    }
    public static int cube(int num) {
        int cube= num*num*num;
        return cube;

    }

}
