package String;

public class ReverseString {

  public static void main(String[] args) {

    String reverse = new StringBuffer("abcd").reverse().toString();
    reverse = new StringBuilder("abcd").reverse().toString();
    System.out.println(reverse("abcd"));
    reverseInteger(1234);
  }

  public static String reverse(String source) {
    String reverse = "";
    for (int i = source.length() - 1; i >= 0; i--) {
      reverse = reverse + source.charAt(i);
    }
    return reverse;
  }


  public static void reverseInteger(int number) {
    int reversenum = 0;

    while (number != 0) {
      int lastDigit = number % 10; // get last digit
      reversenum = reversenum * 10 + lastDigit;
      number = number / 10; // remove last digit , 1/10 gives zero since java truncates
    }

    System.out.println("Reverse of input number is: " + reversenum);
  }


}



