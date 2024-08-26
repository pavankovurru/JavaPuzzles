package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CompareArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 3, 2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");


        System.out.println(CompareArrays.compareArrays());
    }


    public static boolean compareArrays() {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(1,3,2));

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(1,2,3);

        return list1.equals(list2);
//       return  set1.equals(set2);
    }
}
