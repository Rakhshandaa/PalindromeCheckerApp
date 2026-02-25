import java.util.Scanner;
import java.util.Stack;

/**
 * ================================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using a stack to reverse the characters.
 *
 * Key Concepts:
 * - Stack (LIFO)
 * - push() and pop()
 * - efficient reversal
 *
 * Data Structure: Stack<Character>
 *
 * Example Input: "noon"
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a string to check for palindrome: ");
        String text = scanner.nextLine();

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        boolean isPalindrome = text.equals(reversed);

        // Print results
        System.out.println("Original String : " + text);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}