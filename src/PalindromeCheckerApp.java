import java.util.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Simple iterative method
    public static boolean iterativeCheck(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Stack-based method
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray())
            if (c != stack.pop()) return false;
        return true;
    }

    // Deque-based method
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) deque.add(c);
        while (deque.size() > 1)
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string: ignore spaces and case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Performance testing
        long startTime, endTime;

        // Iterative
        startTime = System.nanoTime();
        boolean iterativeResult = iterativeCheck(normalized);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        // Stack
        startTime = System.nanoTime();
        boolean stackResult = stackCheck(normalized);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque
        startTime = System.nanoTime();
        boolean dequeResult = dequeCheck(normalized);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Iterative: " + iterativeResult + " | Time: " + iterativeTime + " ns");
        System.out.println("Stack:     " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque:     " + dequeResult + " | Time: " + dequeTime + " ns");

        scanner.close();
    }
}