package Array;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int sorted[] = merge(new int[] {1, 3, 5, 7}, new int[] {2, 4, 6, 8});
    for (int a : sorted) {
      System.out.println(a);
    }

    System.out.println("***********");

    int[] A = {1, 3, 5, 7};
    int[] B = {2, 4, 6, 8};
    merge_InPlace(A, B);
    System.out.println(Arrays.toString(A));
    System.out.println(Arrays.toString(B));
  }

  public static int[] merge(int[] a, int[] b) {

    int[] answer = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) answer[k++] = a[i++];
      else answer[k++] = b[j++];
    }

    //remaining elements from first & second array
    while (i < a.length) answer[k++] = a[i++];
    while (j < b.length) answer[k++] = b[j++];

    return answer;
  }


  
  public static void merge_InPlace(int[] X, int[] Y) // 1,3,5 & 2,4,6 becomes 1,2,3  & 4,5,6
      {
    int m = X.length;
    int n = Y.length;

    for (int i = 0; i < m; i++) {
      // compare current element of X[] with first element of Y[]
      if (X[i] > Y[0]) {

        // swap (X[i], Y[0])
        int temp = X[i];
        X[i] = Y[0];
        Y[0] = temp;

        
        // move Y[0] to its correct position to maintain sorted  order of Y[].Note: Y[1..n-1] is already sorted
        for (int j = 1; j < n && Y[j] < Y[j-1]; j++) {

          //swap Y[j-1] & Y[j]
          int temp1 = Y[j-1];
          Y[j - 1] = Y[j];
          Y[j] = temp;

        }

      }
    }
  }
}
