package String;


public class Derivative {

  public static void main(String[] args) {

    String x = "ABCD";
    String y = "DABC";

    if (check(x, y)) {
      System.out.println("Input Strings can be derived from one another");
    } else {
      System.out.println("Input Strings cannot be derived from one another");
    }
  }

  public static boolean check(String x, String y) {

    int m;

    if ((m = x.length()) != y.length()) {
      return false;
    }

    for (int i = 0; i < m; i++) {
        x = x.substring(1) + x.charAt(0);

      if (x.equals(y)) {
        return true;
      }
    }

    return false;
  }
}
