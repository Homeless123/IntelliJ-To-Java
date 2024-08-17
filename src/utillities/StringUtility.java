package utillities;

public class StringUtility {
    public static String reverse(String str) {
        String reverse = ""; //to contain all characters of the giving string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i : index number of the given string starting frm last index to index 0
            reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }

        return reverse;
    }


    public static int frequency(String sentence, String word) {
        int count = 0;
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

    //                              "aabacde",       'a'
    public static int frequency(String sentence, char ch) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }
}
