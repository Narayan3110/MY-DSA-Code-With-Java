package sort_And_then_locate;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		int arr[] = { 40, 20, 30, 50, 10 };
		int find = 40;
		bubble(arr, find);
	}

	static void bubble(int arr[], int a) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		Binarysearch(arr, a);

		

	}

//	public static void Linearsearch(int[] arr, int a) {
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == a) {
//				System.out.println("Found at index : " + i);
//
//			} else {
//				count++;
//			}
//
//		}
//
//		System.out.println(count);
//	}

	public static void Binarysearch(int arr[], int target) {
		int first = 0;
		int count = 0;
		int last = arr.length - 1;
		
		while (first <= last) {
			count++;
			int mid = (first + last) / 2;
			if (target == arr[mid]) {
				System.out.println("Found at index : " + mid);
				System.out.println("Comparision made :" + count);
				return;
			} else if (target > arr[mid]) {
				first = mid + 1;
			} else {
				last = mid ;
			}
			
		}
		System.out.println(count);
	}

}
