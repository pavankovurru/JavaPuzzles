package Array;

public class HighestProductOf3 {

    public static void main(String[] args) {
        System.out.println(getHighestProductOfThree(new int[]{1,2,3,4,5}));

        getHighestProductOfThree(new int[]{1,2,3,4,5,6});
    }


    public static int getHighestProductOfThree(int[] arr) {

        if (arr.length < 3) {
            return -1;
        }

        int maximumOne = 0;
        int maximumTwo = 0;
        int maximumThree = 0;
        int minimumOne = 0;
        int minimumTwo = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maximumOne) {
                maximumThree = maximumTwo;
                maximumTwo = maximumOne;
                maximumOne = arr[i];

            } else if (arr[i] > maximumTwo) {
                maximumThree = maximumTwo;
                maximumTwo = arr[i];
            } else if (arr[i] > maximumThree) {
                maximumThree = arr[i];
            }


            if (arr[i] < minimumOne) {
                minimumTwo = minimumOne;
                minimumOne = arr[i];
            } else if (arr[i] < minimumTwo) {
                minimumTwo = arr[i];
            }
        }

        return Math.max(maximumOne * maximumTwo * maximumThree, maximumOne * minimumOne * minimumTwo);
    }



}
