package day23_ArrayList;

import java.util.ArrayList;

/*
3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */
public class uniqueElement {
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();//{1,1,2,3,3,4,}  is not possible
       list.add(1);
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(5);
       list.add(6);

        System.out.println(list);

        for (Integer element : list) {
                //try to find every each unique element
            int frequency=0;
            for (Integer each : list) {
                if (each==element){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(element); //giving us 2,4,6
            break;// exiting the for loop, in order to return the first unique element only
            }
        }




    }
}
