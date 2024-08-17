package day21_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayItro {
    public static void main(String[] args) {

        int [] arr1 = {10, 20, 30};
        int [] arr2 = {40, 50, 60, 70, 80};
        int [] arr3 = {90, 100};
        int [] arr4 = {1, 2};
        System.out.println("---------------------");

        int [][] array2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} }; // index 0 ~ 2
       // index :                 0                   1             2

        System.out.println(array2D.length); // hom many elements have

        System.out.println(Arrays.toString(array2D[1]) ); //[40, 50, 60, 70, 80]
        System.out.println(Arrays.toString(array2D[0]) ); //[10, 20, 30]
        System.out.println(Arrays.toString(array2D[2]) );

        System.out.println(array2D[2][0]); // 90
        System.out.println(array2D[1][2]);



    }
}
