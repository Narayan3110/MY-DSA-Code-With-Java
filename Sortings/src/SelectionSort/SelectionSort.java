package SelectionSort;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args)
	{
		int [] arr = {10 ,15 ,5 ,2 ,60};
		
		  selSort(arr);
		  
		  System.out.println(Arrays.toString(arr));
		  

	}
	
	static void selSort(int[] arr) //Method to find the max
	{
		int temp ;
		//finding max in array 
		for(int i = 0 ; i < arr.length ; i++) {   
			int last = arr.length -1 -i;   //taking the last position of array 
			 int max = maxIndex(arr , 0 , last);  // Finding the index of max array
			   
			 
			 //Swap  the max element at last
			 temp = arr[max] ; 
			 arr[max] = arr[last] ;
			 arr[last] = temp;
			 
		}
		
	}
	
	
	//Method for finding the max element index 
	static int maxIndex(int[] arr , int first , int last) {
		int max = first;
		for(int i = first ; i <= last ;i++ ) {  //loop for checking element is max 
			if(arr[max] < arr[i] ) {
				max = i;   //if not swapping with the greater number index;
			}
		}
		return max;
	}

}
