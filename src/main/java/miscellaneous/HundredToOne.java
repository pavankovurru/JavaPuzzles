package miscellaneous;

public class HundredToOne {

  public static void main(String[] args) {

    //OVERFLOW - causes more iterations
//    for (int i = 0; ; i++) {
//
//      if (i >= -100 && i <= -1) {
//        System.out.println(-i);
//      }
//
//      if (i == -1) break;
//    }
//


    for (int i = 0 ; ; i++){
      if (i == 100){
        break;
      }
      System.out.println(100-i);
    }
  }
}
