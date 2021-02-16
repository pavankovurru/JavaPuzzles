package miscellaneous;

public class Fibanocci {

  public static void main(String[] args) {
      int a=0;
      int b=1;
      int sum = 0;
      int n=10;

      for (int i=0;i<=n;i++){

          System.out.println(sum);

          a=b;
          b=sum;
          sum=a+b;
      }
  }
}
