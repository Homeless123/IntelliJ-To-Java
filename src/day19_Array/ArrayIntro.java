package day19_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int scroe1 = 85;
        int scroe2 = 75;
        int scroe3 = 78;
        int scroe4 = 88;
        int scroe5 = 95;

        System.out.println("------------------------------");

        int [] scroes = new int[5]; // index : 0 ~ 5
        scroes[2] = 78;
        scroes[0] = 85;
        scroes[1] = 75;
        scroes[3] = 88;
        scroes[4] = 95;

//        scroes = new int [10]; //index : 0 ~ 9
//        scroes = new int[50]; //index : 0 ~ 49

        //scroes[-1]= 122;
        //scroes[5] = 100;

        System.out.println( Arrays.toString(scroes));
        System.out.println(scroes[2]);
        System.out.println("----------------------------------");

        for (int i = 0; i < scroes.length; i++) { // i : index number of scores array
            System.out.println(scroes[i]);
        }

        System.out.println("----------------------------------");
        System.out.println(scroes[scroes.length-1]);

    }



}
