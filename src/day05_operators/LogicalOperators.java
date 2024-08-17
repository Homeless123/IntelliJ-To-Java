package day05_operators;

public class LogicalOperators {

    // ---- Logical AND "  && " ---- \\         ( both )


    public static void main(String[] args) {
        double salary =60000;
        int creditScore=650;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >=650 && age>=18 ;

        System.out.println(eligibleForLoan);

        System.out.println("--------------------------------------------------------");

        age =35;
        String country = "USA";
        boolean elegibiltyToVote= age >= 18 && country =="USA";

        System.out.println(elegibiltyToVote);


        System.out.println("--------------------------------------------------------");

        // ---- Logical or " || " ---- \\     ( either )

        String answer= "idk";
        boolean valiedAnswer= answer=="yes"||answer=="no";

        System.out.println(valiedAnswer);

        System.out.println("--------------------------------------------------------");

        char grade= 'B';
        boolean passedTheExam = grade=='A' || grade=='B'||grade=='C'||grade=='D';
        System.out.println(passedTheExam);

        System.out.println("--------------------------------------------------------");

        // ---- LOGICAL NOT OPERATOR " ! " ---- \\

        System.out.println(!true);

        String a = "yes";

        boolean yes = a =="yes";
        System.out.println("yes= "+yes);
        boolean no =!yes;
        System.out.println("no= "+no);

        System.out.println("--------------------------------------------------------");

        int score =65;
        boolean passed = score >=65 ;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("--------------------------------------------------------");

        System.out.println(true == !false && false == !true && true != !true );





    }
}
