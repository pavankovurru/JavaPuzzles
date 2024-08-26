package Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiLine {

    static String input = "hello" +"\n"+ "hola" +"\n"+ "bonjour";

    public static void main(String[] args) {
        Matcher regexMatcher = Pattern.compile(".*?(he.*?)(bon.*?)", Pattern.DOTALL).matcher(input);
        if (regexMatcher.find()) {
            System.out.println("group 0-"+regexMatcher.group(0));
            System.out.println("group 1-"+regexMatcher.group(1));
            System.out.println("group 2-"+regexMatcher.group(2));
        }
    }

}


// CASE INSENSITIVE - Pattern p = Pattern.compile("YOUR_REGEX", Pattern.CASE_INSENSITIVE);
