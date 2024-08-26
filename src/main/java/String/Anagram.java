package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    // I am Lord Voldemort

    //    SIMPLE SOLUTION - convert stings to char array , sort them and compare two arrays

    //    char [] a = "zasdf".toCharArray();
    //        Arrays.sort(a);
    //
    //    char [] b = "fszda".toCharArray();
    //        Arrays.sort(b);
    //
    //        for (int i=0; i < a.length ; i++){
    //        if (a[i]!=b[i]){
    //            System.out.println("false");
    //        }
    //    }
    //
    //        System.out.println("true");


    //  BETTER SOLUTION
    //  O(n) solution  - have frequency of first string characters in a map
    //  for other String return false if there is no character in map, Decrement count if it is found
    //  if its frequency become 0, erase it from map
    //  return true if map becomes empty



    // Function to check if X and Y are anagrams or not
    public static boolean isAnagram(String X, String Y)
    {
        // if X's length is not same as Y's, they can't be anagram
        if (X.length() != Y.length()) {
            return false;
        }

        // create an empty map which will store characters from first string
        Map<Character, Integer> freq = new HashMap<>();

        // maintain count of each character of X in the map
        for (int i = 0; i < X.length(); i++) {
            if (!freq.containsKey(X.charAt(i))) {
                freq.put(X.charAt(i), 1);
            }
            else {
                freq.put(X.charAt(i), freq.get(X.charAt(i)) + 1);
            }
        }

        // do for each character of Y
        for (int i = 0; i < Y.length(); i++)
        {
            // if y is not found in map i.e. either y is not present
            // in String X or has more occurrences in String Y
            if (!freq.containsKey(Y.charAt(i))) {
                return false;
            }

            // decrease the frequency of y in the map
            freq.put(Y.charAt(i), freq.get(Y.charAt(i)) - 1);

            // if its frequency become 0, erase it from map
            if (freq.get(Y.charAt(i)) == 0) {
                freq.remove(Y.charAt(i));
            }
        }

        // return true if map becomes empty
        return freq.isEmpty();
    }

    public static void main(String[] args)
    {
        String X = "tommarvoloriddle";	// Tom Marvolo Riddle
        String Y = "iamlordvoldemort";	// I am Lord Voldemort

        if (isAnagram(X, Y)) {
            System.out.print("Anagram");
        } else {
            System.out.print("Not a Anagram");
        }

    }


}
