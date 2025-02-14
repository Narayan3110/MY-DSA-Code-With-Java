package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 67, 44, 82, 17, 20 };

		System.out.println(Arrays.toString(arr));
		System.out.println();

		InsertionSortMethod(arr);

	}

	private static void InsertionSortMethod(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {

			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}

				else {
					break;
				}
				System.out.println(Arrays.toString(arr));

			}

		}
	}

}

//	For insertion Sort
//	1)Sort the first index
//	2)sort till second index
//	3)each itteration sort the left 

//	for (int k : arr) {
//		System.out.print(k+",");
//	

// Use of Insertion Sort
//	1 ) Best for small data 
//	2 ) work great if data is partially sorted 

//	Time Complexity 
//	Worst -> O(N^2)
//	Best -> O(N) Linear Search 


// Defination
//	1) Insertion sort is a simple sorting algorithm that works much like the way you sort
//		playing cards in your hands. The array is virtually split into a sorted and an un
//		sorted region. Each subsequent element from the unsorted region is inserted into
//		the sorted region at its correct position. Insertion sort is a simple sorting algorithm
//		used to sort a small list of elements. It works the way the human works.

