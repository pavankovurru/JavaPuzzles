package miscellaneous;

import java.util.Arrays;

public class Split {

  public static void main(String[] args) {

        String multiLine = "ab cde  f   xyz" ;
    System.out.println(multiLine.split("[\\s]+").length);
    System.out.println(Arrays.toString(multiLine.split("[\\s]+")));


  }
}
