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


class Node {
    char data;
    Node next;


    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    // Convert string to linked list
    public static Node createLinkedList(String str) {
        Node head = null, tail = null;

        for (int i = 0; i < str.length(); i++) {
            Node newNode = new Node(str.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Check palindrome using linked list
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using fast and slow pointers
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;

        // Compare halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();


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

        Node head = createLinkedList(input);

        if (isPalindrome(head)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();

    }
}