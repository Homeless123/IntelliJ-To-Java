package day17_customClass;
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */
public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique ="";

        for (int i = 0; i < str.length(); i++) { // i : index numbers of str
            char each = str.charAt(i);
            System.out.print(" "+each);
            if (str.indexOf(each)      ==     str.lastIndexOf(each)    ){
        unique +=each;
            }

         }
        System.out.println("\n"+unique);
    }
}