package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequnecOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbccccc"; // a3b4c5
        String result = "";

        // Split the string into an array of characters
        String[] characters = str.split("");

        for (String each : characters) {
            // Calculate the frequency of each character
            int frequency = Collections.frequency(Arrays.asList(characters), each);

            // Append the character and its frequency to the result if not already included
            if (!result.contains(each)) {
                result += each + frequency;
            }
        }

        // Output the result
        System.out.println(result);  // Output: a3b4c5




    }
}
