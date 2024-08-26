package String;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringFromWildCard {

    public static List<String> generateBinaryStrings(String pattern) {
        List<String> result = new ArrayList<>();
        generateBinaryStringsHelper(pattern, 0, "", result);
        return result;
    }

    private static void generateBinaryStringsHelper(String pattern, int index, String current, List<String> result) {
        if (index == pattern.length()) {
            result.add(current);
            return;
        }

        char ch = pattern.charAt(index);
        if (ch == '?') {
            generateBinaryStringsHelper(pattern, index + 1, current + '0', result);
            generateBinaryStringsHelper(pattern, index + 1, current + '1', result);
        } else {
            generateBinaryStringsHelper(pattern, index + 1, current + ch, result);
        }
    }

    public static void main(String[] args) {
        String pattern = "10?1?0";
        List<String> binaryStrings = generateBinaryStrings(pattern);
        System.out.println(binaryStrings); // Output: [100100, 100110, 101100, 101110]
    }
}

//generateBinaryStrings(pattern): This is the main function that initiates the recursive process.
// It creates a list to store the results and calls the helper function.
//
//generateBinaryStringsHelper(pattern, index, current, result):
//
//Base Case: If we've reached the end of the pattern (index == pattern.length()),
// we add the current string to the result list.
//
//Recursive Cases:
//
//If the current character is a wildcard ('?'), we make two recursive calls:
// one replacing it with '0' and another with '1'.
//Otherwise, we simply append the current character to the current string and continue to the next character.

//
//1011000010
//        1011000011
//        1011000111
//        1011100111
//        1111100111