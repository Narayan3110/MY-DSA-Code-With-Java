package binarySearch;

public class first {

	public static void main(String[] args)
	{
		int arr [] = {1,2,3,4,5,6,8,10,20,30,40};
		int target = 10;
		System.out.println(binaraySearch(arr , target));

	}

	public static int binaraySearch(int[] arr, int target) 
	{
		int start = 0 ;
		int end = arr.length-1 ;
		
		
		while(start <= end) {
			int middle = start + (-start + end)/2;
			
			if(target > arr[middle]) {
				start = middle+1;
			}
			else if (target < arr[middle] ) {
				end = middle-1;
			}else if (target == arr[middle]) {
				return middle;
			}
		}
		return -1;
	}

}
