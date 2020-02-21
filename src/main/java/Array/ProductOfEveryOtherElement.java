package Array;

import java.util.Arrays;

public class ProductOfEveryOtherElement {

//input = 1,2,3,4,5   output = 120,60,40,30,24



    public static void findProductByDivision(int []A){

        int product = 1;

        for (int aa : A){
            product *= aa;
        }

        for (int aa : A){
           System.out.println( product / aa);
        }

    }

    // Using Recursion
    public static int findProductBetterWay(int[] A, int n, int leftProduct, int currentIndex)
    {
        // base case: no elements on right side
        if (currentIndex == n) {
            return 1;
        }

        // take back-up of current element
        int currElement = A[currentIndex];

        // calculate product of the right sub-array
        int rightProduct = findProductBetterWay(A, n, leftProduct * currElement, currentIndex + 1);

        // replace current element with product of left and right sub-array
        A[currentIndex] = leftProduct * rightProduct;

        // return product of right sub-array including current element
        return currElement * rightProduct;
    }



    // main function
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5 };
        findProductBetterWay(array, array.length, 1, 0);
        System.out.println(Arrays.toString(array));


//        System.out.println("******");
//        findProductByDivision(new int[]{1,2,3,4,5});
    }


}
