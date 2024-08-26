package String;

import java.util.HashMap;
import java.util.Map;

public class SecondNonRepeatingCharacterInaString {

  public static void main(String[] args) {

    String s = "asdfghasdfjl";

    HashMap<Character, Integer> hm = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {

      if (hm.containsKey(s.charAt(i))) {
        hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
      } else {
        hm.put(s.charAt(i), 1);
      }
    }

//    System.out.println("$$$$$$");
//    hm.forEach((k, v) -> {
//      if (v>1)
//       System.out.println("Key-"+k+ " Value-"+v);
//    });
//    System.out.println("$$$$$$");


    int count = 0;
    for (Map.Entry<Character, Integer> en : hm.entrySet()) {
      if (en.getValue() == 1) {
        count++;
      }
      if (count == 2) {
        System.out.println(en.getKey());
      }
    }
  }
}
