package Array;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(compareArrays(new int[] {1,2,3},new int[] {3,2,1}));
    }

    public static boolean compareArrays(int[] one , int[] two){
        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one,two)){
            return true;
        } else {
            return false;
        }
    }
}
