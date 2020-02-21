package String;

public class SubStringJava {

    public static void main(String[] args) {
        String str = "tutorial";
        String substr = "";

        substr = str.substring(1);
        System.out.println("substring = " + substr);  //substring = utorial

        // prints the substring after index 0 till index 7
        substr = str.substring(0, 7);
        System.out.println("substring = " + substr);  //substring = tutoria
    }
}
