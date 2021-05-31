package Java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.*;
import java.util.function.Consumer;

public class Java8Date {

  public static void main(String[] args) {
    System.out.println(LocalDateTime.now(Clock.systemUTC()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
      System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
      System.out.println(LocalDateTime.now());
//
//      Arrays.asList(1,2,3,4,5).stream().filter(i -> i>2).distinct().forEach(System.out::println);
//
//      List <Integer> test = Arrays.asList(1,2,3,4,5);
//
//      test.stream().map(x-> x+2).forEach( x -> {
//
//
//
//      });



//      HashMap<String, Integer> map = new HashMap<>();
//
//      map.put("A", 1);
//      map.put("B", 2);
//      map.put("C", 3);
//
//    map.entrySet().stream()
//        .forEach(
//            (k) -> {
//              System.out.println(k.getKey());
//              System.out.println(k.getValue());
//            });



    Optional<Integer> op = Optional.ofNullable(null);

    System.out.println("**********");
    System.out.println(op.isPresent());

      op.ifPresent(System.out::println);

    System.out.println(op.orElse(2));

//    System.out.println(op.get());
      System.out.println("**********"+LocalDate.now());



      LocalDate l = LocalDate.now();
      LocalDate l2 = LocalDate.now().plusDays(2);

    System.out.println(Period.between(l,l2).getDays());
  }
}
