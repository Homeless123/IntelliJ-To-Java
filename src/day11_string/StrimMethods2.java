package day11_string;

public class StrimMethods2 {
    public static void main(String[] args) {

     System.out.println("------------- replace-----------------");
        String str1 = "I love Python , Python is the best programming language and Python is in high demand.";
        str1=str1.replace("Python", "C++");
        System.out.println(str1);

        String name ="Java Programming";
       name= name.replace('a','e');
        System.out.println(name);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        String sentence = "I love Java, Java is cool";
        sentence= sentence.replace("Java","Python");
        System.out.println(sentence);

        System.out.println("$$$$$$$$$$$$$----------replaceFirst------------$$$$$$$$$$$$$$");

        String sentence1="I love Java, Java is cool";
        sentence1 = sentence1 .replaceFirst("Java","Sex");
        System.out.println(sentence1);

        System.out.println("·····························");

        String sentence2="I love Java, Java is cool";
        sentence2 =sentence2.replaceFirst(", Java"," Python");
        System.out.println(sentence2);

        System.out.println("&&&&&&&&&&&&&&------------substring-------------&&&&&&&&&&&&&&&&&&&&&&&");

        /*
        substring(beginningIndex): creates substring starting from the given beginning index till the end of the string

					String str = "Cydeo School";
						  str.substring(6) ==> School
         */
        String sentence4="I love Java Programing";

        String language = sentence4 .substring(7,10+1);
        System.out.println(language);

        System.out.println("////////////////////------substring----------/////////////////////////////");
        String day="Today is Sunday , Tomorrow is not Sunday";
        //          0123456789......
        System.out.println(day.substring(0,5));
        System.out.println(day);
        String weakend=day.substring(9,14+1);
        System.out.println(weakend);

        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");

        String email="besiktas@hotmail.com";
        int beginning = email.indexOf('@')+1;
        int ending =email.lastIndexOf('.');

        String domain = email.substring(beginning,ending);
        System.out.println(domain);


     System.out.println("=================================");

     String sentence6 ="I love java programing";
     String r1 =sentence6.substring(7, sentence6.length());
     System.out.println(r1);

     System.out.println("*******************************");

     String sentence7 ="Today is Sunday, Tomorrow is Monday";
     String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+ 1);

     System.out.println(tomorrow);
     System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\");

     String sentence8 ="I study at Cydeo School";

     String schoolname = sentence8.substring(11);
     System.out.println(schoolname);

     System.out.println("---------------------------");


     String str = "Python ";
     String result = str.repeat(12);
     System.out.println(result);


    }}
