package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score=86;

        if(score>=0 && score<=100){ // if the score is valid

            if(score>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else {// if the score not valid
            System.out.println("Invalid score");
        }

        System.out.println("-----------------------");

        int age = 156 ;  // 1~150

        System.out.println("Your age is "+age);

        if (age >= 1 && age <= 150) {

            if(age>=21){
                System.out.println("Eligible");
            }else {
                System.out.println("Not Eligible");
            }

        }else  {
            System.out.println("Not Invalid age");
        }

        System.out.println("-----------------------");

        int day = 7;

        if (day >=1 && day <= 7){
            if (day ==1){
                System.out.println("Monday");
            } else if (day==2) {
                System.out.println("Tuesday");
            } else if (day==3) {
                System.out.println("Wednesday");
            } else if (day==4) {
                System.out.println("Thursday");
            } else if (day==5) {
                System.out.println("Friday");
            }else if (day==6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Not Invalid day");
        }











    }
}
