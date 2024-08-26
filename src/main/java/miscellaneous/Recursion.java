package miscellaneous;

public class Recursion {

  // There has to be an exit condition in recursion, otherwise it leads to stack over flow exception

  public static void main(String[] args) {
    // reduceByOne(9);
    System.out.println(factorial(0));
   // System.out.println(recursiveLinearSearch(new int[] {4, 48, 4, 28, 34, 76, 9, 3}, 0, 3));


    System.out.println(reverse("hello"));
  }

  public static void reduceByOne(int n) {

    if (n >= 0) {
      reduceByOne(n - 1);
    }
    System.out.println("Completed Call: " + n);
  }


  public static int factorial(int n){

    if (n>1){
      System.out.println("Trying "+n);
      return n * factorial(n-1);
    }
   return 1;
  }

  public static String reverse(String s) {

    int l = s.length();

    if (l > 1) {
      return s.charAt(l - 1) + reverse(s.substring(1, l - 1)) + s.charAt(0);
    }

    return s;
  }
}
