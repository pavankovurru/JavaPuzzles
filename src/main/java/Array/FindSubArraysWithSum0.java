package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class FindSubArraysWithSum0 {

  public static void main(String[] args) {

    int[] A = {4,-6,3,-1,4,2,7};
       //printallSubarrays(A);
       printZeroSumSubarray(A);
  }

  // Function to print all sub-arrays with 0 sum present - native approach (N*N)

  public static void printallSubarrays(int[] A) {

    for (int i = 0; i < A.length; i++) {
      int sum = 0;
      for (int j = i; j < A.length; j++) {
        sum += A[j];
        if (sum == 0) {
          System.out.println("Subarray [" + i + "" + j + "]");
        }
      }
    }
  }

  // better approach O(n)

    public static void printZeroSumSubarray(int[] A)
    {
        int currentSum = 0;

        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < A.length ; i ++)
        {
            currentSum += A[i];

            if(currentSum == 0)
            {
                System.out.println("found subset : { 0 - " + i + " }");  // since we are adding elements from zero index to i in sum
                sumMap.put(currentSum, i); //This may not be required
            }

            else if(sumMap.get(currentSum) != null)
            {
                System.out.println("found subset - { " + (sumMap.get(currentSum) + 1) + " - " + i + " }");
                sumMap.put(currentSum, i);
            }

            else if (A[i]==0){
                System.out.println("Found element with 0 value at index - "+i);
            }

            else
                sumMap.put(currentSum, i);
        }


    }

}
