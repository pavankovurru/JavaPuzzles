package miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class Streams {

    public static void main(String[] args){


        System.out.println(DoubleStream.of(1.234,3.456).sum());

        int[] te = {1,2,3};
        System.out.println( Arrays.stream(te).count());
        System.out.println("*****");


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,3,5);

        //numbers.stream().sorted().forEach(System.out::println);
        numbers.stream().filter(i -> i>2).distinct().forEach(System.out::println);
        System.out.println("^^^");
        numbers.stream().map(w -> w+2).forEach(System.out::println);

        //get list of unique squares
        numbers.stream().map(i ->  i*i).distinct().collect(Collectors.toList());


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        strings.stream().forEach(i -> {
            if (i.length()==3)
            System.out.println(i);});
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("Using Java 8: ");
        System.out.println("List: " +strings);

        Long count = strings.stream().filter(i->i.isEmpty()).count();
        System.out.println("Empty Strings: " + count);

        count = strings.stream().filter(i -> i.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

        List<String> filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        List<Integer>  squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);

        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        System.out.println("List: " +integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Random Numbers: ");

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);



    }

}
