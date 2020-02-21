package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElementInArray {


    // Boyer-moore majority , frequency > size/2

    // Function to return majority element present in given array
    public static int majorityElement(int[] A)
    {
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        // store each element's frequency in a map
        for (int i = 0; i < A.length; i++)
        {
            if (map.get(A[i]) == null) {
                map.put(A[i], 1);
            }

            map.put(A[i], map.get(A[i]) + 1);
        }

        // return the element if its count is more than n/2
        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<Integer, Integer> pair = it.next();
            if (pair.getValue() > A.length/2)
                return pair.getKey();

            it.remove(); // avoids ConcurrentModification Exception
        }

        // no majority element is present
        return -1;
    }

    public static void main (String[] args)
    {
        // Assumption - valid input (majority element is present)
        int arr[] = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };

        int res = majorityElement(arr);
        if (res != -1) {
            System.out.println("Majority element is " + res);
        } else {
            System.out.println("Majority element does not exist");
        }
    }


}
