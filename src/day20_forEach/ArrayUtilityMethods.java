package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int [] scores={70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(scores));

        String result= Arrays.toString(scores);
        System.out.println(result);

        System.out.println("-----------------------------------------");

        int []a1={1, 2, 3, 4, 5};
        int[] a2={1, 2, 3, 4, 5};

        Boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1);

        char[] c1={'a','b','c'};
        char[] c2={'a','c','b'};
        Boolean r2 = Arrays.equals(c1,c2);
        System.out.println(r2);

        String[] s1={"a","b","c"};
        String[] s2={"a","c","b"};
        boolean r3 = Arrays.equals(s1,s2);
        System.out.println(r3);
        System.out.println("----------------------------------------------");

        int [] nums={100, 80, 90, 75, 88, 99, 0, 5, 4, 100, 500};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number:" +nums[0]);
        System.out.println("Maximum number:" +nums[nums.length-1]);

        System.out.println("----------------------------------------------");

        String[]b1={"C","A","B"};
        String[]b2={"B","C","A"};

        Arrays.sort(b1);//[A, B, C]
        Arrays.sort(b2);//[A, B, C]

        System.out.println(Arrays.equals(b1,b2));
        System.out.println(Arrays.toString(b2));

        System.out.println("----------------------------------------------");

        String [] sutudents={"Xavi","Jon","Mike","Albert","Alena","Ali","Abril","Jose"};
        System.out.println("Before sorting:"+Arrays.toString(sutudents));
        Arrays.sort(sutudents);
        System.out.println("After sorting:"+Arrays.toString(sutudents));

        System.out.println("----------------------------------------------");

        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(Arrays.toString(array));
        int [] array2 = Arrays.copyOf(array,7); // only 7 element
        System.out.println(Arrays.toString(array2));
        int [] array3 = Arrays.copyOf(array,11); // only 11 element and last 2 is [ 0, 0]
        System.out.println(Arrays.toString(array3));

        System.out.println("----------------------------------------------");

        int[] n1 ={1, 2, 3, 4, 5};
        int[] n2 ={6, 7, 8, 9, 10, 11, 12};

        int [] n3= Arrays.copyOf(n1,n1.length+n2.length); // isn't add n2 element [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(n3));

        for (int i = 0,j = n1.length; i < n2.length; i++,j++) { // is add n2 element [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            n3[j]=n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("----------------------------------------------");

        char[] ch ={'A','B','C','D','E','F','G'};
        // index:    0   1   2   3   4   5   6
        char[] result1 = Arrays.copyOf(ch,4);// giving to us [A, B, C, D]
        System.out.println(Arrays.toString(result1));
        char[] result1a = Arrays.copyOf(ch,20); // [A, B, C, D, E, F, G,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]
        System.out.println(Arrays.toString(result1a));
        char[] result2 = Arrays.copyOfRange(ch ,2 ,4); //[C, D]
        System.out.println(Arrays.toString(result2));
        char [] result3= Arrays.copyOfRange(ch,2,ch.length);
        System.out.println(Arrays.toString(result3));












    }
}
