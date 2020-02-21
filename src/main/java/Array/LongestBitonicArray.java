package Array;

public class LongestBitonicArray {


    //Longest SubArray in increasing order then in decreasing order

    // Function to find length of Longest Bitonic Subarray in an array
    public static void findBitonicSubarray(int[] A)
    {
        int n = A.length;
        int end_index = 0, max_len = 0;

        int i = 0;
        while (i + 1 < n)
        {
            // check for Longest Bitonic Subarray starting at A[i]

            // reset length to 1
            int len = 1;

            // run till sequence is increasing
            while (i + 1 < n && A[i] < A[i + 1]) {
                i++;
                len++;
            }

            // run till sequence is decreasing
            while (i + 1 < n && A[i] > A[i + 1]) {
                i++;
                len++;
            }

            // update Longest Bitonic Subarray if required
            if (len > max_len)
            {
                max_len = len;
                end_index = i;
            }
        }

        // print longest bitonic sub-array
        System.out.println("The length of longest bitonic sub-array is "
                + max_len);

        System.out.println("The longest bitonic sub-array is [" +
                (end_index - max_len + 1) + ", " + end_index + "]");
    }

    // main function
    public static void main(String[] args)
    {
        int[] A = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };  //i=10 , n=11

        findBitonicSubarray(A);
    }
}
