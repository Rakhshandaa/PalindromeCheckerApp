/**
 * ================================================================
<<<<<<< HEAD
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This class checks whether a hardcoded string
 * is a palindrome and displays the result.
=======
 * MAIN CLASS – PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by reversing it using a for loop and comparing both strings.
 *
 * Key Concepts:
 * - for loop
 * - String immutability
 * - String concatenation
 * - equals() method
>>>>>>> feature/UC3
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

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

        // Original string
        String original = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = original.equals(reversed);

        // Display results
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}