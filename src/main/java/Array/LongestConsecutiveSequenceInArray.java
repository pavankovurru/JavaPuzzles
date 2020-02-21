package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {


    public static void main(String[] args) {
        System.out.println(longestConsecutiveSequence(new int[]{1, 6, 7, 5, 8, 3, 4}));
    }

    public static int longestConsecutiveSequence(int[] a) {

        Set<Integer> input = new HashSet<>();
        int largestCount = 1;

        if (a.length == 0) {
            System.out.println("Array size should be greater than 0");
        }

        //create a set from array
        for (int e : a) {
            input.add(e);
        }

        //iterate set
        for (int e : input) {
            int count = 1;

            int left = e - 1;
            int right = e + 1;


            while (input.contains(left)) {
                count++;
                left--;
            }

            while (input.contains(right)) {
                count++;
                right++;
            }

            largestCount = Math.max(count, largestCount);

            System.out.println("Largest sub array so far- "+ ++left + "to" + --right);

        }
        return largestCount;
    }
}
