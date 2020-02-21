package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String s1 = "abc#*@ !dse";

        Matcher m = Pattern.compile("\\W+").matcher(s1);

        if (m.find()){
            System.out.println(m.group(0));
        }


        // multiple occurances
        String inputCharSeq = "Cat AA Cat AA Cat AAA Cat";
        String regex = "Cat";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputCharSeq);

        /*
         * Returns: true if, and only if, a subsequence of the input sequence
         * matches this matcher's pattern
         */
        while (matcher.find())
        {
            System.out.println("Found Cat at: " +matcher.group(0) );
        }
    }
}
