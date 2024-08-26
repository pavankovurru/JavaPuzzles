package String;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubSequenceInString {

    //subsequence is a sequence that can be formed by deleting few elements without changing the order of other elements

    // get count of every character in the string
    // if any character is >=3 then it has repeated sub-sequence
    // create a string by removing characters with 1 occurrence , if that string is not palindrome then there is repeated subsequence.



    //    Input: ABCABD
    //    Output: Repeated Subsequence Exists (A B is repeated)
    //
    //    Input: ABBB
    //    Output: Repeated Subsequence Exists (B B is repeated)
    //
    //    Input: AAB
    //    Output: Repeated Subsequence Doesn't Exist (Note that
    //    A B cannot be considered as repeating because B is at
    //    same position in two subsequences).
    //
    //    Input: AABBC
    //    Output: Repeated Subsequence Exists (A B is repeated)
    //    Input: ABCDACB
    //    Output: Repeated Subsequence Exists (A B is repeated)
    //
    //    Input: ABCD
    //    Output: Repeated Subsequence Doesn't Exist


    // Recursive function to check if str[low..high] is a palindrome or not
    public static boolean isPalindrome(String str)
    {
        String rev= "";

        for (int i = str.length()-1 ; i>=0 ; i--){
            rev = rev + str.charAt(i);
        }

        return str.equals(rev);
    }

    // Function to checks if repeated subsequence is present in the string
    public static boolean repeatedSubsequence(String str)
    {
        // map to store frequency of each distinct character of given string
        Map<Character, Integer> freq = new HashMap<>();

        // update map with frequency
        for (int i = 0; i < str.length(); i++)
        {

            char currentChar = str.charAt(i);

            if (freq.containsKey(currentChar)){
                freq.put(currentChar,freq.get(currentChar)+1);
            } else {
                freq.put(currentChar,1);
            }

            // if frequency of any character becomes 3, we have found the repeated subsequence
            if (freq.get(currentChar) >= 3) {
                return true;
            }
        }

        StringBuilder sb = new StringBuilder() ;

        // consider all repeated elements (frequency 2 or more) and discard all non-repeating elements (frequency 1)
        for (int i = 0; i < str.length(); i++) {
            if (freq.get(str.charAt(i)) >= 2) {
                sb.append(str.charAt(i));
            }
        }

        // return false if temp is a Palindrome, EX:ABCCBA does not have repeated subsequence
        return !isPalindrome(sb.toString());
    }

    public static void main(String[] args)
    {
        String str = "ABCDACB";  //Repeated Subsequence Exists (A B is repeated)


        if (repeatedSubsequence(str))
            System.out.println("Repeated Subsequence present");
        else
            System.out.println("No Repeated Subsequence");
    }
}


// The idea is to remove all the non-repeated characters from the string and check if the resultant string is palindrome or not.
// If the remaining string is palindrome then it is not repeated, else there is a repetition.
// One special case we need to handle for inputs like “AAA”, which are palindrome but their repeated subsequence exists.
// Repeated subsequence exists for a palindrome string if it is of odd length and its middle letter is same as left(or right) character.