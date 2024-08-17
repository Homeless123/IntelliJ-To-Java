package day21_MultiDimentionalArray;

public class MultiDimensionPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D1 = { {{1, 2}, {3, 4, 5}} , { {6, 7, 8, 9}, {10, 11}, {12, 13, 14} } };
        int[][][] arr3D2 = { {{1, 2}, {3, 4, 5}} , { {6, 7, 8, 9}, {10, 11}, {12, 13, 14} } };
        int[][][] arr3D3 = { {{1, 2}, {3, 4, 5}} , { {6, 7, 8, 9}, {10, 11}, {12, 13, 14} } };

        int[][][][] arr4D = { arr3D1 , arr3D2 , arr3D3 }; // the ' N ' dimensional array is a container foe (N-1) dimensional arrays
 //  int[][][][] arr4D that is N
        for (int[][][] each3D : arr4D) { // array N = (N-1)
            for (int[][] each2D : each3D) {
                for (int[] each1d : each2D) {
                    for (int eachElement : each1d) {
                        System.out.println(eachElement);
                    }
                }
            }
        }


    }
}
