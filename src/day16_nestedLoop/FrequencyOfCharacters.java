package day16_nestedLoop;
/*
 FrequencyOfCharacters:
			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
      String str = "AAABBCCCCDDDDD";
      String result ="";
      int frequency = 0;
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count ++;
                }
            }
            if (count == 2 && ! result.contains(""+ch)) {
                frequency+=ch;
            }

        }
        System.out.println(frequency);
    }

}
