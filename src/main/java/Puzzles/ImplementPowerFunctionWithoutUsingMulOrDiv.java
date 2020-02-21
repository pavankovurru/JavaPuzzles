package Puzzles;

public class ImplementPowerFunctionWithoutUsingMulOrDiv {

// WITH * operator
    public static long power(int x, int y) {
        long result = x;

        for (int i = 1; i < y; i++) {
            result = result * x;
        }

        return result;
    }

    //Without using * or / operators
    public static int pow(int a, int b)
    {
        if(b == 0) {
            return 1;
        }

        int res = 0;

        int increment = pow(a, b - 1);

        for(int i = 0; i < a; i++) {
            res += increment;
        }

        return res;
    }


    public static void main(String[] args)
    {
        System.out.print(pow(7, 3));
    }


}
