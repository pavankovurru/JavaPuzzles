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
        System.out.println(prefix);

        for (int i = 0 ; i < s.length() ; i++)
            //combination(prefix + s.charAt(i),  s.substring(i+1,N)); // will get only permutations
            combination(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length())); // will get all permutations and combinations
    }

    //n!
    static void permutation(String prefix, String s)
    {
        if (s.length() == 0)
            System.out.println(prefix);

        for (int i = 0 ; i < s.length() ; i++)
            // recursively calls the permutation method with the new prefix and the remaining string
            // (which excludes the current character).
            permutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
    }

    public static void main(String[] args)
    {
        String s = "1234";
        initiate(s);
    }
}