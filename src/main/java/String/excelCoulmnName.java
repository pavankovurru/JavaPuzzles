package String;

public class excelCoulmnName {

    // Function to convert given number into an excel column
    public static String getColumnName(int n) {
        // initalize output String as empty
        StringBuilder res = new StringBuilder();

        while (n > 0) {

            //EXAMPLES :
            //            System.out.println((char)(1 + 'A'));  // B
            //            System.out.println('A'+1);  // 66
            //            System.out.println('A');  // A

            // find index of next letter and concatenate the letter to the solution

            // Here index 0 corresponds to 'A' and 25 corresponds to 'Z'
            int index = (n - 1) % 26;
            res.append((char) (index + 'A'));
            n = (n - 1) / 26;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        int r = 28;  //28 - AB , 107 - DC
        System.out.println(r + " - " + getColumnName(r));
    }
}
