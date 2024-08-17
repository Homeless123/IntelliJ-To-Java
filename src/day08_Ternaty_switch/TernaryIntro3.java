package day08_Ternaty_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int  score= 62;

        String result = "";

       if (score<=100 && score>=0){
           if (score>= 60){
               result="Passed";
           }else {
               result="Failed";
           }
       }else {
           result="Invalid";
       }
        System.out.println(result);

        System.out.println("----------------------------------------");

        String Result=(score>=0 && score<=100)?

                    (score>=60)?"Passed":"Falied"
                : "Invalid";
        System.out.println(Result);

        System.out.println("-----------------------------**********************-----------------------------");


        int Number=2;

        String day=(Number>=1&&Number<=7) ?
                (Number==21)?"Monday":(Number==2)?"Tuesday":(Number==3)?"Wednesday":(Number==4)?"Thursday"
                        :(Number==5)?"Friday":(Number==6)?"Saturday":"Sunday"
                : "Invalid Day";
        System.out.println(day);



    }
}
