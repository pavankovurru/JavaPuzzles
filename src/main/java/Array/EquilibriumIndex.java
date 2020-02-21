package Array;

import java.util.stream.IntStream;

class EquilibriumIndex
{
    // Optimized method to find equilibrium index of an array
    public static void equilibriumIndex(int[] A)
    {
        // total stores sum of all elements of the array
        int total = IntStream.of(A).sum();	// Java 8

        // right stores sum of elements of sub-array A[i+1..n)
        int rightSum = 0;

        // traverse array from right to left
        for (int i = A.length - 1; i >= 0; i--)
        {

            // sum of elements of left sub-array A[0..i-1] is "(total - (A[i] + right))"
            if (rightSum == total - (A[i] + rightSum)) {
                System.out.println("Equilibrium Index found at " + i);
            }

            // new right = A[i] + (A[i+1] + A[i+2] + .. + A[n-1])
            rightSum += A[i];
        }
    }


    // Program to find the equilibrium index of an array
    public static void main (String[] args)
    {
        int[] A = { 0, -3, 5, -4, -2, 3, 1, 0 };

        equilibriumIndex(A);
    }
}