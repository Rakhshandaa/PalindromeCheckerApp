/**
 * ================================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This program converts a string into a char array and
 * checks whether it is a palindrome using the two-pointer technique.
 *
 * Key Concepts:
 * - char array (char[])
 * - array indexing
 * - two-pointer approach
 * - efficient comparison
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string to check
        String text = "madam";

        // Convert string to character array
        char[] chars = text.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display results
        System.out.println("Input String : " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}