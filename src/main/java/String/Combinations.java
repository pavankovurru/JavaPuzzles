package String;

public class Combinations
{
    static void initiate(String s)
    {
        System.out.println("-----------------PERMUTATIONS---------------- ");
        permutation("", s);
        System.out.println("-------------------COMBINATIONS------------------- ");
        combination("", s);
        System.out.println("----------------------------------------- ");
    }

    static void combination(String prefix, String s)
    {
        int N = s.length();
        System.out.println(prefix);

        for (int i = 0 ; i < N ; i++)
            //combination(prefix + s.charAt(i),  s.substring(i+1,N)); // will get only permutations
            combination(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1,N)); // will get all permutations and combinations
    }

    static void permutation(String prefix, String s)
    {
        int N = s.length();

        if (N == 0)
            System.out.println("" + prefix);

        for (int i = 0 ; i < N ; i++)
            permutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
    }

    public static void main(String[] args)
    {
        String s = "1234";
        initiate(s);
    }
}