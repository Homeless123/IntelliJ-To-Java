package day08_Ternaty_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'D';

        String result="";

        if(grade == 'A'){
            result="Excellent";
        }
        if (grade == 'B'){
            result="Great job";
        }
        if (grade == 'C'){
            result="Good";
        }
        if (grade == 'D'){
            result="Passed";
        }
        if (grade == 'F'){
            result="Failed";
        }
        System.out.println(result);

        System.out.println("-------------*******************------------------");

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;
                case 'B':
                    System.out.println("Great job");
                    break;
                    case 'C':
                        System.out.println("Good");
                        break;
                        case 'D':
                            System.out.println("Passed");
                            break;
                            case 'F':
                                System.out.println("Failed");
                                break;
            default:
                System.out.println("Invalid grade");
                break;



        }






    }
}
