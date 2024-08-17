package day21_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimasionArrayPractice {
    public static void main(String[] args) {


        String [] group1 = {"Lucy", "Josef", "Johny" ,"Eric"}; // 4 names
        String [] group2 = {"Alex", "Oscar", "Adriana"};// 3 names
        String [] group3 = {"Isabel", "Alexa", "Miguel", "Luis", "Elisabet"}; // 5 names
        String [] group4 = {"Adam", "Luca"}; // 2 names

        String [][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
             String [] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
            String eachStudent = eachGroup[j];
            System.out.println(eachStudent);
            }
        }
        System.out.println("***********************************");

        for ( String [] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
                
            }
        }
        System.out.println("/////////////////////");

        for (int i = groups.length - 1; i >= 0; i--) {
            String [] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String EachStudent : eachGroup) {
                System.out.println(EachStudent);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println(groups);
        System.out.println(Arrays.toString(groups)); // tiString() ==> for single dimensional array ONLY
        System.out.println( Arrays.deepToString(groups)); // deepToString() ==> for multi-dimensional arrays ONLY



    }
}
