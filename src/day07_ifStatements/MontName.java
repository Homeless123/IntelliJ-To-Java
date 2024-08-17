package day07_ifStatements;

public class MontName {
    /*
    Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex:
Given:

number = 10

output:

October

Note: Assume that the given number is between 1 ~ 12
     */
    public static void main(String[] args) {

        int number =8;

        String month ="";

        if (number>=1 && number<=12){
            if (number==1){
                month="January";
            }else if (number==2){
                month="February";
            }else if (number==3){
                month="March";
            }else if (number==4){
                month="April";
            }else if (number==5){
                month="May";
            }else if (number==6){
                month="June";
            }else if (number==7){
                month="July";
            }else if (number==8){
                month="August";
            }else if (number==9){
                month="September";
            }else if (number==10){
                month="October";
            }else if (number==11){
                month="November";
            }else {
                month="December";
            }
        }else {
            System.out.println("No such a month");
        }
        System.out.println(month);




    }
}
