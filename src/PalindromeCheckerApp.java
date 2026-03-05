import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome (ignoring case and spaces)
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("The string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}