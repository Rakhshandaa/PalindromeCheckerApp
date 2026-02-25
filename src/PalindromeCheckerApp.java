import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ================================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by using a Queue (FIFO) and a Stack (LIFO).
 *
 * Key Concepts:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue, Dequeue, Push, Pop
 * - Logical comparison for palindrome
 *
 * Data Structures: Queue<Character>, Stack<Character>
 *
 * Example Input: "civic"
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a string to check for palindrome: ");
        String text = scanner.nextLine();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue to Queue & Push to Stack
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch); // enqueue
            stack.push(ch); // push
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // FIFO
            char fromStack = stack.pop();    // LIFO
            if (fromQueue != fromStack) {
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