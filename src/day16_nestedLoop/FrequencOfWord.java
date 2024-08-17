package day16_nestedLoop;
/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4

 */
public class FrequencOfWord {
    public static void main(String[] args) {

        String  sentence = "java JAVA jAvA JAva";
        String word = "java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word,"");

        }
        System.out.println(count);


    }
}
