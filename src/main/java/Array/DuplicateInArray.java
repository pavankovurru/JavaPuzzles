package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class DuplicateInArray {
  public static void main(String[] args) {
    int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 8};

    Set<Integer> set = new HashSet<>();


    for (int i = 0; i < array.length; i++) {
      // If same integer is already present then add method will return FALSE
      if (set.add(array[i]) == false) {
        System.out.println("Duplicate element found : " + array[i]);
      }
    }


    System.out.println("*********************");

    int[] A = { 1, 2, 3, 4, 4 ,5,3};
    System.out.println("The duplicate element is " + findDuplicate(A));
  }


  public static HashMap findDuplicate(int[] A)
  {
    HashMap<Integer,Integer> counter = new HashMap<>();

    for (int element : A){
      if (counter.get(element) != null){
        counter.put(element,counter.get(element)+1);
      }
      else
      {
        counter.put(element,1);
      }
    }
    return counter;
  }




}
