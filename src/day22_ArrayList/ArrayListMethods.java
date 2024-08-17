package day22_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);// empty
        list.add(12);// int 0
        list.add(23);// int 1
        list.add(34);// int 2
        list.add(45);// int 3
        //list.add(5.6); X double
        //list.add(4.5); // giving error bc of is double
        list.add(1,15);// [12,15,23,34,45]
        System.out.println(list);// [12,15,23,34]

        list.add(2,25);
        System.out.println(list);
        //list.get() get calling by INTEGER

        list.remove(2);
        System.out.println(list);

        System.out.println("··································");

        ArrayList<String> student = new ArrayList<>();
        student.add("Ali");
        student.add("Bob");
        student.add("Mike");
        student.add("John");
        System.out.println("student.size() = " + student.size());
        System.out.println("student = " + student);
        //student.get() calling by STRING

        String lastStudent = student.get(student.size()-1);
        String firstStudent = student.get(0);
        System.out.println("firstStudent = " + firstStudent);
        System.out.println("lastStudent = " + lastStudent);

        System.out.println("++++++++++++++++++++++++++++++++");





    }
}
