package Array;

// Find pair of elements(index location) with a sum in the array
// output - "Pair found at index 0 and 2"

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class FindPairWithSumMatchingInput {

  public static void main(String[] args) {
    int arr[] = {8, 7, 2, 5, 3, 1};
    int sum = 9;
    findPair_BestTomeComplexity_On(arr, sum);
  }

  // Naive method to find a pair in an array with given sum
  // Quadratic approach.

  public static void findPair(int arr[], int sum) {
    // n is length of the array
    int n = arr.length;

    // consider each element except last element
    for (int i = 0; i < n; i++) {
      // start from i'th element till last element
      for (int j = i + 1; j < n; j++) {
        // if desired sum is found, print it and return
        if (arr[i] + arr[j] == sum) {
          System.out.println("Pair found at index " + i + " and " + j);
          return;
        }
      }
    }

    // No pair with given sum exists in the array
    System.out.println("Pair not found");
  }

  public static void findPair_n_logn(int arr[], int sum) {
    // sort the array in ascending order
    Arrays.sort(arr);

    // maintain two indexes pointing to end-points of the array
    int low = 0;
    int high = arr.length - 1;

    // reduce search space arr[low..high] at each iteration of the loop

    // loop till low is less than high
    while (low < high) {
      // sum found
      if (arr[low] + arr[high] == sum) {
        System.out.println("Pair found at index " + low + " and " + high);
        return;
      }

      // increment low index if total is less than the desired sum
      // decrement high index is total is more than the sum
      if (arr[low] + arr[high] < sum) low++;
      else high--;
    }

    // No pair with given sum exists in the array
    System.out.println("Pair not found");
  }

  public static void findPair_BestTomeComplexity_On(int arr[], int sum) {
    // create an empty Hash Map
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    // do for each element
    for (int i = 0; i < arr.length; i++) {
      // check if pair (arr[i], sum-arr[i]) exists

      // if difference is seen before, print the pair
      if (map.containsKey(sum - arr[i])) {
        System.out.println("Pair found at index " + map.get(sum - arr[i]) + " and " + i);
        return;
      }

      // store index of current element in the map
      map.put(arr[i], i);
    }

    // No pair with given sum exists in the array
    System.out.println("Pair not found");
  }
}
