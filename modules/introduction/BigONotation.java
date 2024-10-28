package modules.introduction;

/**
 * 
 * Class demonstrating different time and space complexities using Big O
 * Notation.
 * 
 */

public class BigONotation {

    // O(1) Time | O(1) Space - Constant time and space complexity

    public static void constantTimeExample(int[] arr) {

        System.out.println("First element: " + arr[0]); // Accessing the first element

    }

    // O(n) Time | O(1) Space - Linear time complexity and constant space complexity

    public static void linearTimeExample(int[] arr) {

        for (int element : arr) {

            System.out.print(element + " "); // Iterating over each element

        }

        System.out.println();

    }

    // O(n^2) Time | O(1) Space - Quadratic time complexity and constant space
    // complexity

    public static void quadraticTimeExample(int[][] matrix) {

        for (int[] row : matrix) {

            for (int element : row) {

                System.out.print(element + " "); // Nested loops over 2D array

            }

            System.out.println();

        }

    }

    // O(log n) Time | O(1) Space - Logarithmic time complexity and constant space
    // complexity

    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                return mid;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return -1; // Target not found

    }

    // O(n) Time | O(n) Space - Linear time complexity and linear space complexity
    // (due to extra space for the result array)

    public static int[] createNewArray(int[] arr) {

        int[] newArr = new int[arr.length]; // Space grows with input size

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i]; // Copy elements

        }

        return newArr;

    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int[][] matrix = { { 1, 2 }, { 3, 4 } };

        // O(1) Time | O(1) Space

        constantTimeExample(arr);

        // O(n) Time | O(1) Space

        linearTimeExample(arr);

        // O(n^2) Time | O(1) Space

        quadraticTimeExample(matrix);

        // O(log n) Time | O(1) Space

        int index = binarySearch(arr, 30);

        System.out.println("Element found at index: " + index);

        // O(n) Time | O(n) Space

        int[] newArr = createNewArray(arr);

        for (int element : newArr) {

            System.out.print(element + " ");

        }

        System.out.println();

    }

}
