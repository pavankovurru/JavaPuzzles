package String;

public class RotatedPalindrome {

    public static void main(String[] args) {
        // check for all rotations of the given string if it is palindrome or not

        String str = "ABACCAAA";
        int m = str.length();

        for (int i = 0; i < m; i++) {
            // in-place rotate the string by 1 unit
            str = str.substring(1) + str.charAt(0);

            // return true if the rotation is a palindrome
            if (isPalindrome(str)) {
                System.out.println("String is a rotated palindrome");
            }
        }
    }

    public static boolean isPalindrome(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equals(reverse)) {
            return true;
        }
        return false;
    }

}
