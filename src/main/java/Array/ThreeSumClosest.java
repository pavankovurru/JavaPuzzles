package Array;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

        System.out.println("******************");
        System.out.println(threeSumClosest(new int []{1,1,1,0},100));
    }

    public static int threeSumClosest(int[] nums, int target) {

        int minDiff = Integer.MAX_VALUE;
        int finalResult = 0;   //contains closest value to target

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int start = i + 1;
            int end = nums.length - 1;

           while (start < end) {

                int sum = nums[i] + nums[start] + nums[end];

                int diff = Math.abs(sum - target);

                if(diff == 0) {
                    System.out.println(nums[i]+"->"+nums[start]+"->"+nums[end]);
                    return sum;
                }

                if (diff < minDiff) {
                    minDiff = diff;
                    finalResult = sum;
                }

                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return finalResult;
    }

}
