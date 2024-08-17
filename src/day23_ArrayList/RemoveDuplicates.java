package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("James");
        names.add("James");
        names.add("John");
        names.add("Mary");
        names.add("Mary");
        names.add("Bob");
        names.add("Mary");

        ArrayList<String> nonDup=new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
            // System.out.println(nonDup);
        }
        System.out.println(names);
        System.out.println("---------------------------------------------");
        System.out.println(nonDup);


    }
}
