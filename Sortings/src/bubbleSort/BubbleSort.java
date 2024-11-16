package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		int[] a = { 100, 20, 80, 70, 90, 30 };
		for (int i = 0; i < a.length; i++) { // loop for selecting the elements

			for (int j = 1; j < a.length-i ; j++) { // loop for comparing the element with
				
				if (a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
			
		}

		System.out.println(Arrays.toString(a));
	}

}
