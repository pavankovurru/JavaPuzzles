package String;

public class RotatedPalindrome {



    //native solution is to check if any rotated string is a palindrome

//    // check for all rotations of the given string if it
//    // is palindrome or not
//		for (int i = 0; i < m; i++)
//    {
//        // in-place rotate the string by 1 unit
//        str = str.substring(1) + str.charAt(0);
//
//        // return true if the rotation is a palindrome
//        if (isPalindrome(str)) {
//            return true;
//        }
//    }


    // 2 nd approach concatenate string with itself and see if there is a palindrome of length of original string.

    //both solutions re o(n square)


    // expand in both directions of low and high to find palindrome of length k
    private static boolean expand(String str, int low, int high, int k)
    {
        while (low >= 0 && high < str.length() && (str.charAt(low) == str.charAt(high)))
        {
            // return true palindrome of length k is found
            if (high - low + 1 == k) {
                return true;
            }

            // expand in both directions
            low--;
            high++;
        }

        // return false if palindrome of length k is not found
        return false;
    }

    // Function to check if palindromic substring of length k exists or not
    private static boolean LongestPalindromicSubString(String str, int k)
    {
        for (int i = 0; i < str.length() - 1; i++) {
            // check if odd length or even length palindrome of length k having str.charAt(i) as its mid point exists
            if (expand(str, i, i, k) || expand(str, i, i + 1, k)) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        // palindromic string
        String str = "ABCCBA";

        // rotate it by 2 units
        str = "CCBAAB";

        if (LongestPalindromicSubString(str+str , str.length())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
