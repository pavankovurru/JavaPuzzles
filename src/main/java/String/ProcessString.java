package String;

import java.util.HashSet;

public class ProcessString {

  public static void main(String[] args) {
      System.out.println(prosessString("Automotive Parts"));  // should output - A6e P3s (first character followed by unique characters till last character and then last character.)
      System.out.println(prosessString("123Parts123"));
      System.out.println(prosessString("123Auto"));

  }

    public static String prosessString(String input) {

        String output = "";
        int wordStartIndex = 0;
        int delimiterStartIndex = 0;


        while (wordStartIndex < input.length()) {

            //Setting up word start Index
         try {
            //If character is not alphabetic append it to output and increment word index
            while (!Character.isAlphabetic(input.charAt(wordStartIndex))) {
                output = output + input.charAt(wordStartIndex); // add non alphabet character to output
                wordStartIndex++;
            }
          } catch (Exception e) { // Handling input String that end with non Alphabetical Character
           return output;
        }


            //Setting up Delimit index
            delimiterStartIndex = wordStartIndex + 1;
            while (delimiterStartIndex < input.length() && Character.isAlphabetic(input.charAt(delimiterStartIndex))) {
                delimiterStartIndex++;
            }


            // Get Number of unique characters
            HashSet<Character> set = new HashSet<>();
            // ignoring first and last letter of word
            for (int i = wordStartIndex + 1; i < delimiterStartIndex - 1; i++) {
                set.add(input.charAt(i));
            }

            //Creating output for a word
            output =
                    output
                            + String.valueOf(input.charAt(wordStartIndex))
                            + set.size()
                            + String.valueOf(input.charAt(delimiterStartIndex - 1));


            //Setting word and delimiter for next word
            wordStartIndex = delimiterStartIndex;

        }
        return output;
    }
}
