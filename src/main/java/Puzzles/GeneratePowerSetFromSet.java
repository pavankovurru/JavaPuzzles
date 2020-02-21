package Puzzles;


import java.util.LinkedList;

public class GeneratePowerSetFromSet {

    // Function to generate power set of given set array
    public static void findPowerSet(int[] array, LinkedList<Integer> list, int arraySize)
    {
        // if we have considered all elements
        if (arraySize == 0) {
            System.out.println(list);
            return;
        }

        // consider nth element
        list.addLast(array[arraySize-1]);
        findPowerSet(array, list, arraySize - 1);

        // or don't consider nth element
        list.removeLast();
        findPowerSet(array, list, arraySize - 1);
    }

    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3 };
        LinkedList<Integer> list = new LinkedList<>();
        findPowerSet(array, list, array.length);
    }

}
