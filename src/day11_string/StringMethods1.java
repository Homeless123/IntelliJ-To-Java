package day11_string;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "JAVA PROGRAMING";

       str1= str1.toLowerCase(); // "cydeo school"
        System.out.println(str1);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        String str2 = "java Programing";
        String str3= str2.toUpperCase();
        System.out.println(str2+"\tbefore than =");
        System.out.println(str3);
        str2= str2.toUpperCase();
        System.out.println(str2+"\tafter than =");

        System.out.println("*****************************");

        String word ="Wood";
        word = word.toUpperCase();
        word = word.toLowerCase();// every time givin last value
        System.out.println(word);

        System.out.println("-------------------- trim -------------------");

        String str4 = "          java Programing";
        System.out.println(str4);
        System.out.println(str4.length());
        str4= str4.trim();
        System.out.println(str4);
        System.out.println(str4.length());

     System.out.println("---------------------indexOf-----------------");

     String sentence = "Today is new day and everything going to be perfect";
     int index1 = sentence .indexOf('e');
     System.out.println(sentence .length());
     System.out.println(index1);
     String firstIndex="I love you more than owen";
     int index2 = firstIndex.indexOf('o');
     System.out.println(index2);
     int index3=firstIndex.indexOf(" o");
     System.out.println(index3);

     System.out.println(
             "**********************"
     );

     String x2="Java Python JavaScript Programing";
    int a1 = x2.indexOf('o');
     System.out.println(a1);
     int a2 = x2.indexOf('J');
     System.out.println(a2);
     int a3 = x2.indexOf(" J");
     System.out.println(a3);
     int a4 = x2.indexOf("a");
     System.out.println(a4);
     int a5 = x2.indexOf("am");
     System.out.println(a5);

     System.out.println("///////////********lastIndexOf********//////////////");

     String w = "Java";
     System.out.println(w.indexOf('a'));
     System.out.println(w.lastIndexOf('a'));





}}
