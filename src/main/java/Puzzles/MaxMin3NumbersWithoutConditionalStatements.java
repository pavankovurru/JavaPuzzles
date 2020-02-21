package Puzzles;

public class MaxMin3NumbersWithoutConditionalStatements {

    public static void main(String[] args) {

        System.out.println(smallest(1,2,3));
        System.out.println(biggest(1,2,3));
    }


    static int smallest(int x, int y, int z)
    {
        int c = 0;
        while (x != 0 && y != 0 && z != 0) {
            x--;
            y--;
            z--;
            c++;
        }
        return c;
    }

    static int biggest(int x, int y, int z)
    {
        int c = 0;
        while (x != 0 || y != 0 || z != 0) {
            x--;
            y--;
            z--;
            c++;
        }
        return c;
    }


}
