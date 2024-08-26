package String;

import java.util.*;

public class DuplicateWordSearcher {
  public static void main(String[] args) {
    String text =
        "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";

      List<String> list = Arrays.asList(text.split(" "));
      for (String a:list){
          System.out.println(a + ":"+ Collections.frequency(list, a));
      }
    System.out.println("^^^^^^^^^^^^^^^^^^");
  }
}
