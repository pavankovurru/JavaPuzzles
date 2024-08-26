package Java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadDemo {

  public static void main(String[] args) throws IOException {
    //
    //    Runnable r =
    //        () -> {
    //          for (int i = 0; i < 10; i++) {
    //            System.out.println("Child Thread");
    //          }
    //        };
    //
    //    Thread t = new Thread(r);
    //    t.start();
    //
    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("Main Thread");
    //    }

    //      TreeSet <Integer> ts = new TreeSet<>((i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0);
    //      ts.add(1);
    //      ts.add(4);
    //      ts.add(-1);
    //      ts.add(0);
    //
    //    System.out.println(ts);
    //
    //    String Test = "$1,685,670.33";
    //
    //      System.out.println("$1,685,670.33".replaceAll(",",""));
    //    System.out.println(Test.replaceAll(",", "").matches("\\$\\d+\\.\\d{2}"));

    //      HashMap<String, Integer> map = new HashMap<>();
    //
    //      map.put("A", 1);
    //      map.put("B", 2);
    //      map.put("C", 3);
    //
    //    map.entrySet().stream()
    //        .forEach(
    //            hm -> {
    //              System.out.println(hm.getKey());
    //              System.out.println(hm.getValue());
    //            });

    //      List<String> memberNames = new ArrayList<>();
    //      memberNames.add("Amitabh");
    //      memberNames.add("Shekhar");
    //      memberNames.add("Aman");
    //      memberNames.add("Rahul");
    //      memberNames.add("Shahrukh");
    //      memberNames.add("Salman");
    //      memberNames.add("Yana");
    //      memberNames.add("Lokesh");
    //
    //
    //      memberNames.stream().sorted().forEach(System.out::println);
    //
    //      List<Integer> ints = IntStream.of(1,2,3,4,5)
    //              .boxed()
    //              .collect(Collectors.toList());





    System.out.println("**************");

    Files.list(Paths.get(System.getProperty("user.dir"))).forEach(System.out::println);

    System.out.println("**************");

    Files.newDirectoryStream(Paths.get(System.getProperty("user.dir"))).forEach(System.out::println);

  }

  public boolean test() {
    try {
     return Files.lines(Paths.get(System.getProperty("user.dir"), "Test.txt"))
          .anyMatch( line -> line.matches("test123"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return false;
  }


  }
