package String;

import java.util.Arrays;

public class StringDerivedFromAnother {

    // Simple solution is to check if y is a substring of x+x  , but this takes o(n) additional space

    //    String combined = X + X ;
    //      if (combined.contains(Y)){
    //        System.out.println("YES!");
    //    }


    public static void main(String[] args) {

      String X = "ABCD";
      String Y = "DABC";


      if (check(X, Y)) {
          System.out.println("Given Strings can be derived from each other");
      }
      else {
          System.out.println("Given Strings cannot be derived from each other");
      }
    }

    // Function to check if X can be derived from Y by rotating it
    public static boolean check(String X, String Y)
    {
        int m;

        // if String lengths are different, they can't be derived from each other
        if ((m = X.length()) != Y.length()) {
            return false;
        }


        for (int i = 0; i < m; i++)
        {
            // left rotate String X by 1 unit
            X = X.substring(1) + X.charAt(0);

            // return true if X becomes equal to Y
            if (X.equals(Y)) {
                return true;
            }
        }

        // return false if no rotation is matched
        return false;
    }


    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }




}
