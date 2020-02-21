package miscellaneous;

public class SwapVariables {

  public static void main(String[] args) {

    int a = 10;
    int b = 20;

    a = a + b;
    b = a - b;
    a = a - b;

    // + & - can be replaced by * & /

    System.out.println("a-" + a + " b-" + b);

    // SORTING ARRAYS
    //      Arrays.sort(array);
    //      Arrays.sort(Array , Collections.reverseOrder());

    // SORTING COLLECTIONS
    //      Collections.sort(arrayList);
    //      Collections.reverseOrder(arrayList);

  }
}
