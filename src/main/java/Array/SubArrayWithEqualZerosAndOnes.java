package Array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithEqualZerosAndOnes {

  public static void main(String[] args) {
      int[] arr = {1, 0, 0, 1, 0, 1, 1};
      int[] result = findLargestSubarrayWithEqualZeroAndOne(arr);

      if (result.length == 0) {
          System.out.println("No subarray with equal 0s and 1s found.");
      } else {
          System.out.println("Largest subarray with equal 0s and 1s is from index "
                  + result[0] + " to " + result[1]);
      }
  }



    public static int[] findLargestSubarrayWithEqualZeroAndOne(int[] arr) {
        // HashMap to store the first occurrence of each cumulative sum
        HashMap<Integer, Integer> sumMap = new HashMap<>();  // sum & index
        int cumulativeSum = 0;
        int maxLength = 0;
        int startIndex = -1;
        int endIndex = -1;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Convert 0 to -1
            if (arr[i] == 0) {
                arr[i] = -1;
            }

            // Update cumulative sum
            cumulativeSum += arr[i];

            // Check if cumulative sum is zero
            if (cumulativeSum == 0) {
                if (i + 1 > maxLength) {
                    maxLength = i + 1;
                    startIndex = 0;
                    endIndex = i;
                }
            }

            // Check if this cumulative sum has been seen before
            if (sumMap.containsKey(cumulativeSum)) {
                int previousIndex = sumMap.get(cumulativeSum);
                //Check if This Subarray is the Largest Found So Far
                if (i - previousIndex > maxLength) {
                    maxLength = i - previousIndex;
                    startIndex = previousIndex + 1;
                    endIndex = i;
                }
            } else {
                // Store the first occurrence of this cumulative sum
                sumMap.put(cumulativeSum, i);
            }
        }

        // If no valid subarray is found, return an empty array
        if (maxLength == 0) {
            return new int[0];
        }

        // Return the indices of the largest subarray
        return new int[]{startIndex, endIndex};
    }

    public static int findSubarraysWithEqualZeroAndOne(int[] arr) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int cumulativeSum = 0;
        int count = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Convert 0 to -1 to help find subarrays with equal 0s and 1s
            if (arr[i] == 0) {
                arr[i] = -1;
            }

            // Update cumulative sum
            cumulativeSum += arr[i];

            // If cumulative sum is zero, it means subarray from start to current index has equal 0s and 1s
            if (cumulativeSum == 0) {
                count++;
            }

            // If cumulative sum has been seen before, it means subarray from the previous index
            // where this sum occurred to the current index has equal 0s and 1s
            if (sumMap.containsKey(cumulativeSum)) {
                count += sumMap.get(cumulativeSum);
            }

            // Update the HashMap with the current cumulative sum
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }


}
