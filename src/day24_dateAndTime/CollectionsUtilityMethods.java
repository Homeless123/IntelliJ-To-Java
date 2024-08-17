package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();

        name.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));
        System.out.println(name);
/*
        System.out.println(name);
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).equals("Java")) {
                name.set(i, "Python");
            }
        }
        System.out.println(name);
*/
        //it same only calling by replace methods
        Collections.replaceAll(name, "Java", "Python");

        System.out.println(name);

        System.out.println("---------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count =Collections.frequency(list, 50);

        System.out.println(count);

        System.out.println("---------------------------------");
        ArrayList<String> word = new ArrayList<String>();

        word.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));
        System.out.println(word);

        int countJava =Collections.frequency(word, "Java");
        int countC = Collections.frequency(word, "C#");
        System.out.println(countJava);
        System.out.println(countC);

        System.out.println("-------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));
                // it unique
        for (Integer each : numbers) {
            if( Collections.frequency(numbers,each) == 1 ){
                System.out.println(each);
            }
        }
                // repeat and unique
        for (Integer each : numbers) {
            if (Collections.frequency(numbers,each)==2){
                System.out.println(each);
            }
        }







    }
}
