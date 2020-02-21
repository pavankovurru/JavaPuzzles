package String;

import java.util.HashSet;
import java.util.Set;

public class Interleavings {

    // Function to find all interleaving of String X and Y
    public static void interleavings(String res, String X, String Y, Set<String> out)
    {
        // insert res into set if we have reached end of both Strings
        if (X.length() == 0 && Y.length() == 0)
        {
            out.add(res);
            return;
        }

        // if String X is not empty, append its first character in the result and recur for remaining substring
        if (X.length() > 0) {
            interleavings(res + X.charAt(0), X.substring(1), Y, out);
        }

        // if String Y is not empty, append its first character in the result and recur for remaining substring
        if (Y.length() > 0) {
            interleavings(res + Y.charAt(0), X, Y.substring(1), out);
        }
    }

    public static void main(String[] args)
    {
        String X = "ABC";
        String Y = "DEF";

        // use set to handle duplicates
        Set<String> out = new HashSet<>();
        interleavings("", X, Y, out);

        out.stream().forEach(System.out::println);
    }


}
