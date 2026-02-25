/**
 * ================================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This class checks whether a hardcoded string
 * is a palindrome and displays the result.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check if palindrome
        boolean isPalindrome = text.equals(reversed);

        // Print output (exact required format)
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}