package day19_Array;

import java.util.Arrays;

public class ArrayPritice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "Ali";
        myGroup[myGroup.length - 1] = "Bob";
        myGroup[2] = "Veli";
        myGroup[1] ="Mike";
        myGroup[3] = "Jack";

        System.out.println(Arrays.toString(myGroup));

        myGroup[0] ="Ahmet";
        //  myGroup[5] ="Becit";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------");

       for ( int i = myGroup.length-1 ; i >= 0;i-- ){
           System.out.println(myGroup[i]);
       }

        System.out.println("----------------------");

        for (int i = 0; i < myGroup.length; i++) { // myGroup.fori it shortcut
            System.out.println(myGroup[i]);
        }

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/");

        for (int i = myGroup.length - 1; i >= 0; i--) { // myGroup.sorr it shortcut tersten yazmaya basliyor
            System.out.println(myGroup[i]);
        }


//        myGroup[1] = "Bob";
//        myGroup[2] = "Alice";
//        myGroup[3] = "Beckham";
//        myGroup[4] = "Ayse";
//        for (int i = 0; i < myGroup.length; i++) {
//            System.out.println(i + ": " + myGroup[i]);
//        }







    }
}
