import java.util.Scanner;
class StringOperations{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input string 1
        System.out.print("Enter the first string: ");
        String str1 = in.nextLine();

        // Input string 2
        System.out.print("Enter the second string: ");
        String str2 = in.nextLine();

        // String length
        System.out.println("Length of str1: " + str1.length());

        // String concatenation
        String concatString = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatString);

        // String comparison (case-insensitive)
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal ignoring case.");
        } else {
            System.out.println("str1 and str2 are not equal ignoring case.");
        }

        // Substring example
        if (str1.length() >= 3) {
            String substr = str1.substring(0, 3); // Example: Extract first 3 characters
            System.out.println("Substring of str1 (first 3 characters): " + substr);
        } else {
            System.out.println("String length is less than 3 characters. Cannot extract substring.");
        }
    }
}
