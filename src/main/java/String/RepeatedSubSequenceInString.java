package String;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubSequenceInString {


    // get count of every character in the string
    // if any character is >=3 then it has repeated sub-sequence

    // create a string by removing characters with 1 occurrence , if that string is not palindrome then there is repeated subsequence.



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

            if (freq.containsKey(str.charAt(i))){
                freq.put(currentChar,freq.get(currentChar)+1);
            } else {
                freq.put(currentChar,1);
            }

            // if frequency of any character becomes 3, we have found the repeated subsequence
            if (freq.get(str.charAt(i)) >= 3) {
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

        // return false if temp is a Palindrome
        return !isPalindrome(sb.toString());
    }

    public static void main(String[] args)
    {
        String str = "XYBYAXB";		// XB is repeated subsequence

        if (repeatedSubsequence(str))
            System.out.println("Repeated Subsequence present");
        else
            System.out.println("No Repeated Subsequence");
    }
}
