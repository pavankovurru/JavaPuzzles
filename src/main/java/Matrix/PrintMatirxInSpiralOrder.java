package Matrix;

public class PrintMatirxInSpiralOrder {  // TIME COMPLEXITY - O(M*N)

    private static void printSpiralOrder(int[][] mat)

    {
        int top = 0;
        int left = 0;
        int bottom = mat.length - 1;  //rows
        int right = mat[0].length - 1; //columns

        while (true)
        {

            // HANDLE TOP ROW
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // HANDLE RIGHT COLUMN
            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;


            //HANDLE BOTTOM ROW
            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " ");
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            //HANDLE LEFT COLUMN
            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
        }
    }

    // main function
    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 1,  2,  3,  4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                };

        printSpiralOrder(mat);
    }

}
