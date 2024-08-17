package day08_Ternaty_switch;

public class TerariesIntro {
    public static void main(String[] args) {

        int score =65;
        String result="";
        if(score >=60){
            result="Passed";
        }else{
            result="Failed";
        }
        System.out.println(result);

        System.out.println("-----------------------------");

        String result2=(score>=60) ? "Passed" : "Failed";

        System.out.println(result2);

        System.out.println("----------------------------------");

        int age =19;

        String r="";

        if(age>=21){
            r="Eligible";
        }else {
            r="Not Eligible";
        }
        System.out.println(r);
        System.out.println("-------------------------------------------");

        String result3= age>=18 ? "Eligible" : "Not Eligible";
        System.out.println(result3);


    }
}
