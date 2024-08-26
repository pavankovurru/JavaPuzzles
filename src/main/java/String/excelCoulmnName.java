package String;

public class excelCoulmnName {

    public static String convertToColumnName(int n) {
        StringBuilder columnName = new StringBuilder();

        while (n > 0) {
            n--; // Adjust for 0-based index (Excel columns are 1-based)
            int remainder = n % 26;
            columnName.insert(0, (char)(remainder + 'A')); // Prepend the character to the result
            n = n / 26;
        }

        return columnName.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(convertToColumnName(1));   // Output: A
        System.out.println(convertToColumnName(26));  // Output: Z
//        System.out.println(convertToColumnName(27));  // Output: AA
//        System.out.println(convertToColumnName(52));  // Output: AZ
//        System.out.println(convertToColumnName(701)); // Output: ZY
//        System.out.println(convertToColumnName(702)); // Output: ZZ
//        System.out.println(convertToColumnName(703)); // Output: AAA
    }
}
