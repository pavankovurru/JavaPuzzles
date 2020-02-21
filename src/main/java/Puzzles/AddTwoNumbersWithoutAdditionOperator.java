package Puzzles;

public class AddTwoNumbersWithoutAdditionOperator {


    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add1(3,5));
        System.out.println(add2(1,2));

    }

    public static int  add(int a, int b){
        return a-(-b);
    }

    public static int  add1(int a, int b){

        // to handle positive a
        while (a > 0)
        {
            b++;
            a--;
        }

        // to handle negative a
        while (a < 0)
        {
            b--;
            a++;
        }

        return b;
    }

    public static int add2(double a, double b){

        //use log and exponential functions

        System.out.println(Math.exp(a));
        System.out.println(Math.exp(b));
        final double a1 = Math.exp(a) * Math.exp(b);
        System.out.println(Math.log(a1));

        return (int) Math.log(a1);

    }

}
