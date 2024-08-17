package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addAll(2,numbers);

        System.out.println(list1);

        System.out.println("------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) );
        System.out.println("scores = " + scores);

        System.out.println("------------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList( "Ali","Veli","Can","Mike"));
        System.out.println("students = " + students);

        students.addAll(2, Arrays.asList("Ahmet","Ernst","Jorge"));
        System.out.println("students = " + students);

        System.out.println("------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> l1 = new ArrayList<>();
        //l1.addAll(nums); giving to error
        l1.addAll( Arrays.asList(nums));

        System.out.println("l1 = " + l1);
            // it other way
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(nums));
        System.out.println("l2 = " + l2);

        System.out.println("------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll(Arrays.asList("Ahmet","Mike","Jose","Alper","Miguel"));
        System.out.println("employeesList = " + employeesList);

        boolean hasMike =employeesList.contains("Mike");
        boolean hasMikeJose =employeesList.containsAll(Arrays.asList("Mike","Jose"));
        boolean hasAhmetJoseMiguel= employeesList.containsAll(Arrays.asList("Ahmet","Jose","Miguel"));

        System.out.println("hasMikeJose = " + hasMikeJose);
        System.out.println("hasMike = " + hasMike);
        System.out.println("hasAhmetJoseMiguel = " + hasAhmetJoseMiguel);

        System.out.println("-----------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(123,1,2,3,4,5,6,7,1,1,1,1,2,2,2,2));
        list.removeAll(Arrays.asList(1,2));
        System.out.println(list);
        //boolean remove = list.removeAll(Arrays.asList(123));
        //System.out.println("remove = " + remove);
        list.remove(0);
        System.out.println(list+" after removes methods");

        System.out.println("----------------------------------------");

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Ahmet","Mike","Jose","Alper","Jose","Walter","Ahmet","Jose"));

        developers.retainAll(Arrays.asList("Ahmet","Mike","Jose"));

        System.out.println("developers = " + developers);

        ArrayList<String> groceriesList= new ArrayList<>();

        groceriesList.addAll(
            Arrays.asList("Eggs","Patato","Milk","Rice","Orange","Tomato",
                          "Strawberry","BlueBerry","Paper towels")
        );
        groceriesList.retainAll(Arrays.asList("Eggs","Patato","Milk","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));
        //groceriesList.removeAll(Arrays.asList("Rice","Orange","Paper towels"));
        System.out.println(groceriesList);


    }
}
