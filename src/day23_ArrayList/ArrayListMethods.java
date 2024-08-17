package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int [] array={1, 2, 3, 4, 5};
        array[0]=100;
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------");

        ArrayList<String> groceriesList=new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");
        System.out.println(groceriesList);//[Eggs, paper Towels, Apples, Cooking oil]
        //groceriesList[2]="Oranges";                               !
        groceriesList.set(2,"Oranges");//                           !
        System.out.println(groceriesList);//[Eggs, paper Towels, Oranges, Cooking oil]

        groceriesList.add(2, "Chicken");//                         |
        System.out.println(groceriesList);

        groceriesList.remove(0);// remove the Eggs
        System.out.println(groceriesList);
//        groceriesList.remove(0);// remove the paper Towels
//        System.out.println(groceriesList);

        groceriesList.remove("paper Towels");
        System.out.println(groceriesList);

        System.out.println("*******************");

        ArrayList<Integer> number =new ArrayList<>();
        number.add(10); // 0
        number.add(20); // 1
        number.add(30); // 2
        number.add(40); // 3
        number.add(50); // 4
        boolean r1 =number.remove(Integer.valueOf(20));
        System.out.println(number);

        System.out.println(r1);
        number.clear();
        System.out.println(number);
        System.out.println(number.size());
        System.out.println("***********************");
        ArrayList<String> names=new ArrayList<>();
        names.add("James");
        names.add("James");
        names.add("John");
        names.add("Mary");
        names.add("Mary");
        names.add("Bob");
        names.add("Mary");

        System.out.println( names.indexOf("James"));
        System.out.println( names.lastIndexOf("James"));

        System.out.println( names.lastIndexOf("Bob"));

        boolean hasAhmet = names.contains("Ahmet");
        boolean hasBob = names.contains("Bob");
        System.out.println("hasAhmet = " + hasAhmet);
        System.out.println("hasBob = " + hasBob);

        System.out.println("--------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=list1;

        list1.add(1);
        list1.add(2);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(list1==list2);

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));

        System.out.println("----------------------------------");

        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty()); // false

        System.out.println("----------after-----------");

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());







    }
}
