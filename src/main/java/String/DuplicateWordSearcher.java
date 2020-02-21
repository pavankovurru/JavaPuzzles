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

      //*********** 2nd WAY **************************************

    list.stream()
        .forEach(
            i -> {
              System.out.println(i +":"+Collections.frequency(list, i));

            });

    for (String word : list) {
      System.out.println(word + ": " + Collections.frequency(list, word));
    }

    System.out.println("^^^^^^^^^^^^^^^^^^");

    System.out.println(6/2);
    System.out.println(6 % 2);
  }
}
