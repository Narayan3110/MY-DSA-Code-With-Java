package CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 4 };

        cyclicSrt(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Cyclic sort

    // When To use Cyclic Sort
    // 1. When we have to find the duplicate in the array
    // 2. When we have to find the missing number in the array
    // 3. When we have to find the first missing number in the array
    // 4. When we have to find the last missing number in the array

    // Advantage
    // 1. It is a simple algorithm
    // 2. It is a space efficient algorithm
    // 3. It is a time efficient algorithm

    // Time Complexity
    // O(n) where n is the number of elements in the array (Best Case)
    // O(n^2) where n is the number of elements in the array (Worst Case)
    // Space Complexity
    // O(1) where n is the number of elements in the array (Best Case)

    private static void cyclicSrt(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }

    }

    // Swap Method
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
