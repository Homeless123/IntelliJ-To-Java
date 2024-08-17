package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));


        int max =Collections.max(list);
        int min =Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        System.out.println("------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Potato","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));

        Collections.sort(items);
        System.out.println(items);
        System.out.println("--------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("-----------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));

        System.out.println(students);
        Collections.swap(students,0,1);
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);


    }
}
