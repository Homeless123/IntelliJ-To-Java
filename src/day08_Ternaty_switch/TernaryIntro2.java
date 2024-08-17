package day08_Ternaty_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number =-1;
        String result=(number>0) ? "Positive" :(number<0) ? "Negative" :"Zero"; System.out.println(result);

        // ? is if statment :? else if statments ? else its have to be same to ? and :

        System.out.println("-------------------------------");

        String result1 ="";
        if(number>0){
            result1="Positive";
        } else if (number<0) {
            result1="Negative";
        }else {
            result1="Zero";
        }
        System.out.println(result1);

        System.out.println("--------------------------");

        int day =2;
        String Gunler =(day==1) ? "Monday" : (day==2) ? "Tuesday" : (day == 3) ? "Wednesday"
                : (day == 4) ? "Thursday" : (day==5) ? "Friday" : (day==6) ? "Saturday" : "Sunday";
        System.out.println(Gunler);

        System.out.println("----------------------------------");

        int num=11;
        String month =(num==1) ? "January" :(num==2) ? "February" : (num==3) ? "March" : (num==4) ? "April" :
                (num==5) ? "May" : (num == 6) ? "June" : (num==7) ? "July" : (num==8) ? "August" : (num==9)
                ? "September" : (num==10) ? "October" : (num==11) ? "November" : "December";
        System.out.println(month);


    }
}
