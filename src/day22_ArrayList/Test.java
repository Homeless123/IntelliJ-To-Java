package day22_ArrayList;

import utillities.ArrayUtility;

public class Test {
    public static void main(String[] args) {
        int[] number={10, 20, 30, 40, 50, 60, 70, 90};

        boolean has25=ArrayUtility.contains(number,25);
        System.out.println("has25 = " + has25);

        System.out.println("--------------");

        String[] students ={"Ali", "Hamza", "John"};
        System.out.println(ArrayUtility.contains(students,"Khashavar"));


    }
}
