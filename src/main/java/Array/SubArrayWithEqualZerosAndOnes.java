package Array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithEqualZerosAndOnes {

  public static void main(String[] args) {
      int[] A = { 0, 0, 1, 0, 1, 0, 0 };
      maxLenSubarray(A);
  }



    public static void maxLenSubarray(int[] A)
    {
        // create an empty Hash Map to store ending index of first sub-array having some sum
        Map<Integer, Integer> map = new HashMap<>();

//        // insert (0, -1) pair into the set to handle the case when sub-array with sum 0 starts from index 0
//        map.put(0, -1);

        // maximumLen stores the maximum length of sub-array with sum 0
        int maximumLen = 0;

        // stores ending index of maximum length sub-array having sum 0
        int ending_index = -1;

        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < A.length; i++)
        {
            // sum of elements so far (replace 0 with -1)
            sum += (A[i] == 0)? -1: 1;

            // if sum is seen before
            if (map.containsKey(sum))
            {

                int currentLength = i-map.get(sum);
                if (maximumLen < currentLength)
                {
                    maximumLen = currentLength;
                    ending_index = i;
                }
            }
            // if sum is seen for first time, insert sum with it index into the map
            else {
                map.put(sum, i);
            }
        }


        // print the sub-array if present
        if (ending_index != -1) {
            System.out.println("[" + (ending_index - maximumLen + 1) + ", " +
                    ending_index + "]");
        }
        else {
            System.out.println("No sub-array exists");
        }
    }



}
