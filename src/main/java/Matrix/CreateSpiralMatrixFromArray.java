package Matrix;

import java.util.Arrays;

public class CreateSpiralMatrixFromArray {

    private static final int M = 5;
    private static final int N = 5;

    private static void printSpiralOrder(int[] arr, int[][] mat)
    {
        int top = 0, bottom = M - 1;
        int left = 0, right = N - 1;

        int arrayIndex = 0;

        while (true)
        {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = arr[arrayIndex++];
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = arr[arrayIndex++];
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = arr[arrayIndex++];
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = arr[arrayIndex++];
            }
            left++;
        }
    }

    // Create Spiral Matrix from given array
    public static void main(String[] args)
    {
        // array of length M*N
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

        int[][] mat = new int[M][N];
        printSpiralOrder(arr, mat);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++ ) {
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
    }
}
