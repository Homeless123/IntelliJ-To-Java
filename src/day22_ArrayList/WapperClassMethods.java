package day22_ArrayList;

public class WapperClassMethods {
    public static void main(String[] args) {
        // parse amd valueOf methods
        String str ="20";
        System.out.println(str+1);//201

        Integer num1=Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);
        System.out.println(num1+1);//21
        System.out.println(num+1);//21

        Integer num2 =Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("--------------------------");

        String s = "20.5";
        double num3 = Double.parseDouble(s);
        Double num4 = Double.parseDouble(s);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("--------------------------");

        String x= "true";
        boolean x1=Boolean.parseBoolean(x);
        Boolean x2=Boolean.parseBoolean(x);
        System.out.println(x1);
        System.out.println(x2);
        String xx= "idk";
        boolean xx1=Boolean.parseBoolean(xx);
        Boolean xx2=Boolean.parseBoolean(xx);
        System.out.println(xx1);
        System.out.println(xx2);

        System.out.println("--------------------------");

        char ch ='1';
        boolean isDigit=Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        char ch1 ='A';

        boolean isLetter=Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        boolean isLowerCase=Character.isLowerCase(ch1);
        System.out.println("isLowerCase = " + isLowerCase);

        boolean isUpperCase=Character.isUpperCase(ch1);
        System.out.println("isUpperCase = " + isUpperCase);

        boolean isSpecialCharacter=!Character.isLetterOrDigit(ch);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);

        System.out.println("*************************");


        String string = "a1b2c3d4e5";
        int sum = 0;

        // Iterate over each character in the string
        for (char each : string.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(each)) {
                // Convert the character to its integer value and add to the sum
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);









    }
}
