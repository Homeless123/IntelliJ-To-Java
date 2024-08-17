package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("James");
        names.add("James");
        names.add("John");
        names.add("Mary");
        names.add("Mary");
        names.add("Bob");
        names.add("Mary");
        names.add("John");
        names.add("Mary");
        names.add("Mike");
        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)) {
                System.out.println(each); // bob and mike
            break; // only giving first unique not all 
            }
        }





    }
}
