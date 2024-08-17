package day23_ArrayList;
/*
    2. Write a program that can find
        the average number from an arrayList of integers
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0;
        for (Integer each : list ){
            sum += each;
        }
        System.out.println(sum);// 270

        double avarage = sum/ (double)list.size();
        System.out.println(avarage);

        System.out.println("-----------------");

        ArrayList<Integer> list2 =new ArrayList<>(Arrays.asList(15,25,35,45));

        list2.add(2,99);
        System.out.println(list2);

        Integer[] nums = new Integer[7];
        nums[0] = 15;
        nums[1] = 25;
        nums[2] = 35;
        nums[3] = 45;
        nums[4] = 60;
        nums[5] = 70;
        nums[6] = 20;

        nums[1]=12;


        System.out.println(Arrays.toString(nums));







    }
}
