package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {

      String str ="Barcelona";
      //           0123
      //          "avaJ"

        String reverse=""; // "avaJ"
        for (int i = str.length()-1; i >=0 ; i--) {
          reverse += str.charAt(i);

        }
        System.out.println(reverse);

        System.out.println("/*/*/*/*/*/*/*/*/*");

        String name="London Madrid Moscow";
        String result = reverse(name);
        System.out.println(result);


    }

    public static String reverse(String str) {
        String reverse="";
        for (int i = str.length() -1 ;  i  >=0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

}
