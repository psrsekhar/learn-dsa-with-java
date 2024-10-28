package modules.introduction;

/**
 * Class demonstrating recursion examples.
 */
public class RecursionExamples {

    // Factorial example: O(n) Time | O(n) Space
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    // Fibonacci example: O(2^n) Time | O(n) Space
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: first Fibonacci number is 0
        } else if (n == 1) {
            return 1; // Second Fibonacci number is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    // Sum of an array: O(n) Time | O(n) Space
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0; // Base case: sum of an empty array is 0
        }
        return arr[n - 1] + sumArray(arr, n - 1); // Recursive case
    }

    // Reverse a string: O(n) Time | O(n) Space
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return ""; // Base case: empty string
        }
        return reverseString(str.substring(1)) + str.charAt(0); // Recursive case
    }

    // Check if a number is palindrome: O(log n) Time | O(log n) Space
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n, 0); // Call a helper function to reverse the number
    }

    // Helper function to reverse a number
    private static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed; // Base case
        }
        return reverseNumber(n / 10, reversed * 10 + n % 10); // Recursive case
    }

    public static void main(String[] args) {
        // Example 1: Factorial
        System.out.println("Factorial of 5: " + factorial(5)); // 120

        // Example 2: Fibonacci
        System.out.println("Fibonacci of 5: " + fibonacci(5)); // 5

        // Example 3: Sum of an array
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of array: " + sumArray(arr, arr.length)); // 15

        // Example 4: Reverse a string
        String str = "hello";
        System.out.println("Reversed string: " + reverseString(str)); // "olleh"

        // Example 5: Palindrome check
        int num = 121;
        System.out.println("Is 121 a palindrome? " + isPalindrome(num)); // true
    }
}
