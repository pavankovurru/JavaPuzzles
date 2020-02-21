package String;

public class LongestPalindrome {

    static String longest="";
    static int size=0;


    public static void main(String[] args) {

        String act = "rssasassd";

        for (int i=0;i<act.length();i++){
            for (int j=i+1;j<act.length();j++){
                String str=act.substring(i, j+1);

                if (LongestPalindrome.isPalindrome(str)){

          if (str.length() > size) { // important
            longest = str;
            size = str.length();
          }
        }
      }
    }

    System.out.println(longest);
  }

  public static boolean isPalindrome(String s) {

    String rev = "";

    for (int i = s.length() - 1; i >= 0; i--) {
      rev = rev + s.charAt(i);
    }

    if (s.equals(rev)) {
      return true;
    }

    return false;
  }
}
