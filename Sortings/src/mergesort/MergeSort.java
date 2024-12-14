package mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args)
	{
		int [] arr = {30 ,60 ,25,5,2,10};
		
		divide(arr, 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

			
	static void divide(int[]arr , int left , int right) //Method for dividing the array into half
	{
		int mid = (left + right) /2 ; 
		if(left < right)   // until my right is has something we will divide the array
		{
			
			//Recursively calling till we get single element 
			divide(arr , left , mid);   //left part dividing again , now the end will change it will be half 
			divide(arr, mid+1 , right);  // right part will divide again , here the start will be mid+1 
			
			
			//Then will merge the array in sorted format
			merge(arr ,left , mid , right);
		}
	}


	private static void merge(int[] arr, int left, int mid, int right)
	{
		int leftsize = mid - left +1; //size of new array for left
		int rightsize = right - mid ;  //  size of new array for right
		
		
		// New Array For storing array while merging
		int[] leftarr = new int[leftsize];  
		int[] rightarr = new int[rightsize];
		
		
		//Will add the Element in Left New Array
		for(int i = 0 ;  i < leftsize ; i++) {
			leftarr[i] = arr[left+i];
		}
		
		//Adding Element in right array 
		for(int j = 0 ; j < rightsize ; j++) {
			rightarr[j] = arr[mid+1+j]; 
		}
		
		
		//Sort the array 
		int i= 0 ; //For left side comparison		
		int j = 0 ;  // For right side comparison
		int k =left; // for moving in original array
		while(i < leftsize && j < rightsize)  //compare till one of the array is empty
		{
			if(leftarr[i] <= rightarr[j]) {   //If Element of left size is less than element at right
				arr[k] = leftarr[i];   //Putting that element at index 0 of original array 
				i++; //Moving to new Element of left 
			}
			else {
				arr[k] = rightarr[j];
				j++;
			}
			k++;  // increase the index by one after each add in original array  
		}
		
		
		while(i< leftsize) {   //If Any element is remaining in left it will be added
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		
		while(j < rightsize) {  // Extra elements if remaining in right it will be added
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}
}

