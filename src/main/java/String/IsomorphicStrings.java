package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    //Two strings, X and Y , are called isomorphic if all occurrences of each character in X can be
    // replaced with another character to get Y and vice-versa. For example, consider strings ACAB and XCXY .
    // They are isomorphic as we can map 'A' —> 'X' , 'B' —> 'Y' and 'C' —> 'C' .

    // Find if String X and Y are Isomorphic or not
    public static boolean isIsomorphic(String X, String Y)
    {
        // if X and Y have different lengths, they cannot be Isomorphic
        if (X.length() != Y.length()) {
            return false;
        }

        // use map to store mapping from characters of String X to String Y
        Map<Character, Character> map = new HashMap<>();

        // use set to store pool of already mapped characters
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < X.length(); i++)
        {
            char x = X.charAt(i), y = Y.charAt(i);

            // if x is seen before
            if (map.containsKey(x))
            {
                // return false if first occurrence of x is mapped to different character
                if (map.get(x) != y)
                    return false;
            }

            // if x is seen for the first time (i.e. it is not mapped yet)
            else
            {
                // return false if y is already mapped to some other char in X
                if (set.contains(x))
                    return false;

                // map y to x and mark it mapped
                map.put(x, y);
                set.add(x);
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        String X = "ACAB";
        String Y = "XCXY";

        if (isIsomorphic(X, Y)) {
            System.out.print(X + " and " + Y + " are Isomorphic");
        }
        else {
            System.out.print(X + " and " + Y + " are not Isomorphic");
        }
    }

}
