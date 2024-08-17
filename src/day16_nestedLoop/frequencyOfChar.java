package day16_nestedLoop;
/*
 write a program that can return the frequencyOfChar of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */
public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "aabbccaabbcc";
        char ch = 'c';
        int count = 0;

        for (int i = 0; i < str.length(); i++) { // index number of str
            if (str.charAt(i)==ch){
                count++;

            }

        }

        System.out.println(count);

    }
}
