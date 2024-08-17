package day22_ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);//255 after 400 it index 4 not 3
        numbers.add(500);
        numbers.add(3,255);
        //numbers.add(-1,255); not possible
        //numbers.add(10,255); you cant pass directly u have tou write some index before than index 10
        System.out.println(numbers);
        System.out.println("**************************");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------");
        for (int i = numbers.size() -1 ; i >= 0 ; i--) {
            System.out.println(numbers.get(i));
        }
        System.out.println("---------------------");
        for (Integer each : numbers) {
            System.out.println(each);
        }
        System.out.println("***********");

        for (int each : numbers) {
            System.out.println(each);
        }
    }
}
