// ---------------------------------------------
// List of Additional Features and Modifications:
// 1. Changed the language from C to Java.
// 2. Added a `Scanner` class for user input instead of using `printf` and `scanf`.
// 3. Created a `SortDescending` class to encapsulate the sorting functionality.
// 4. Modified `sortDescending` method to accept an array size parameter instead of a fixed size.
// 5. Implemented input validation to ensure the user enters a positive integer for the array size.
// 6. Allowed dynamic array size input from the user instead of a fixed size of 10 elements.
// 7. Added a loop to prompt the user for each index when entering numbers into the array.
// 8. Implemented an optimization in the sorting algorithm to break early if no swaps occur (optimized bubble sort).
// 9. Used enhanced for-loop for printing the sorted array.
// 10. Closed the `Scanner` object after use to prevent resource leaks.
// ---------------------------------------------

import java.util.Scanner;

public class SortDescending {

    // Function to sort the array in descending order using Bubble Sort
    public static void sortDescending(int[] arr) {
        int temp;
        boolean swapped;

        // Bubble Sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Input validation
        if (size <= 0) {
            System.out.println("Invalid size! Size must be a positive integer.");
            return;
        }

        int[] numbers = new int[size];

        // Get the array elements from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number for index " + i + " : ");
            numbers[i] = scanner.nextInt();
        }

        // Call the sorting function
        sortDescending(numbers);

        // Print the sorted array
        System.out.println("Numbers in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
