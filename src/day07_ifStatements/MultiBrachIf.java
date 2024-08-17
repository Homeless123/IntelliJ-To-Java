package day07_ifStatements;

public class MultiBrachIf {         // need to create 3 or more condition
    public static void main(String[] args) {
        int num =8;
        String result ="";

        if(num > 0){
            result="Positive";
        }
        if(num < 0){
            result="Negative";
        }
        if(num == 0){
            result="Zero";
        }
        System.out.println(result);

        System.out.println("---------------------");

        String result2="";

        if (num > 0){
            result2="Positive";
        } else if (num < 0) {
            result2="Negative";
        }if (num == 0){
            result2="Zero";
        }
        System.out.println(result2);


    }
}
