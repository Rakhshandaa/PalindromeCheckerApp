import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ================================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This program uses a Deque to check whether a string
 * is a palindrome by comparing front and rear elements.
 *
 * Key Concepts:
 * - Deque (Double Ended Queue)
 * - removeFirst() & removeLast()
 * - optimized comparison
 *
 * Data Structure: Deque<Character>
 *
 * Example Input: "racecar"
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a string to check for palindrome: ");
        String text = scanner.nextLine();

        // Create a deque
        Deque<Character> deque = new LinkedList<>();

        // Add characters to deque
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        // Compare front and rear
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Print results
        System.out.println("Input String : " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}