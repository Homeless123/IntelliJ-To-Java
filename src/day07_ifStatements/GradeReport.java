package day07_ifStatements;

public class GradeReport {
    /*
    Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:

score = 95

output:
Your grade is A

Note: Assume that the given score is between 0 ~ 100
     */
    public static void main(String[] args) {

        int score=82;

        String result="";

        if (score<=100&&score>=90){
            result="A";
        } else if (score<90 &&score>=80) {
            result="B";
        }else if (score<80&&score>=70) {
            result="C";
        } else if (score<70&&score>=60) {
            result="D";
        }else {
            result="F";
        }
        System.out.println("Your grade is: "+result);

        int Score=67;

        System.out.println("---------------------------");
        if (Score>=90){
            result="A";
        } else if (Score>=80) {
            result="B";
        }else if (Score>=70) {
            result="C";
        } else if (Score>=60) {
            result="D";
        }else {
            result="F";
        }
        System.out.println("Your grade is: "+result);


    }
}
