package day06_ifStatements;

public class NumberOfDays {
    /*
    An integer variable named month is declared and given, Write a
program that can print the number of days in the given month

Ex:
Given:
number = 1

output:
31 days

Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
     */
    public static void main(String[] args) {

        int number =6;

        boolean has28Days = number==2,
                has30Days = number==4 || number==6 || number==9 || number==11,
                has31Dats = !has30Days&&!has28Days; ;
        String monthName="";
        if(number==1){
            monthName="January";
        }
        else if(number==2){
            monthName="February";
        }
        else if(number==3){
            monthName="March";
        }
        else if(number==4){
            monthName="April";
        }
        else if(number==5){
            monthName="May";
        }
        else if(number==6){
            monthName="June";
        }
        else if(number==7){
            monthName="July";
        }
        else if(number==8){
            monthName="August";
        }
        else if(number==9){
            monthName="September";
        }
        else if(number==10){
            monthName="October";
        }
        else if(number==11){
            monthName="November";
        }
        else if(number==12){
            monthName="December";
        }
        System.out.println(monthName);

        String result ="";

        if (has28Days)
            result=("28 days");
        if (has30Days)
            result=("30 days");
        if (has31Dats)
            result=("31 days");
        System.out.println(result);





    }

}

