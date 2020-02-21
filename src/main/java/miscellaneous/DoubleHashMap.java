package miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleHashMap {
  public static void main(String[] args) {

      HashMap<String , HashMap<String , Integer>> details = new HashMap<>();
      HashMap<String, Integer> inner = new HashMap<>();

      String data = "pavan kovurru,15704 apex plaza,78728";
      String dataArray[]=data.split(",");

      String key = dataArray[0];

      //update existing key in hashmap
      if (details.containsKey(key)){
          inner.put(dataArray[1],Integer.parseInt(dataArray[2]));
      }

      //put new key in hash map
      else
      {
          inner.put(dataArray[1],Integer.parseInt(dataArray[2]));
      }

      details.put(key,inner);

      //print Hash map contents
      System.out.println(details.get("pavan kovurru").get("15704 apex plaza"));



  }
}
