package Array;

import java.util.Arrays;
import java.util.HashSet;

public class CompareArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 3, 2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }


    public static boolean compareArrays(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));
        return set1.equals(set2);
    }
}
