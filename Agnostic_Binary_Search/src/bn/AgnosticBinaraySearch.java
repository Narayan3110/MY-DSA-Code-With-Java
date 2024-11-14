package bn;

public class AgnosticBinaraySearch {
	 
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60};
		int target = 510; 
		System.out.println(bsearch(arr , target));
	}
	
	static boolean bsearch(int arr[] , int t)
	{
		int start = 0;
		int last = arr.length-1;
		
		int middle = start +( last - start)/2;
		
		if(middle > t) {
			last = middle -1 ;
		}
		else if (middle < t) {
			start = middle + 1;
		}
		else if (middle == t) {
			System.out.println("Found it");
	
		}return true;
	}
}
