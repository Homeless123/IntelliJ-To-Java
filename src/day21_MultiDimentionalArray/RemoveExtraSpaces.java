package day21_MultiDimentionalArray;

import java.util.Arrays;

/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */
public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";
        //str=str.trim();
        //System.out.println(str);
        String [] word = str.split(" ");
       // System.out.println(Arrays.toString(word));
        str="";
        for ( String each : word ) {
           if (!each.isEmpty()){
               str+=each+" ";
           }
        }
        str=str.trim(); // to remove the last space

        System.out.println(str);



    }

}
