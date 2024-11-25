import java.util.Scanner;

public class Problem2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt() ;
		
//		int arr [] = new int[n];
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			
//			arr[i] = sc.nextInt();
//		}
		int arr[] = {5 , 3, 1,6,2,1,-3,1,1,4,0,0,4};
		poly(arr);
	}

	public static void poly(int[] arr) 
	{
		int last = arr[arr.length-1];
		
		for(int i = 0 ; i < arr.length - 3 ; i = i+3) 
		{
//			if(arr[i+2] == 1) {
//				sign = '+';
//			}
//			else if(arr[i+2] == 0 ) {
//				sign = '-';
//			}
			char sign = arr[i+2] == 1 ? '+' : '-' ;
			System.out.print(last*arr[i]+"x^"+arr[i+1]);
			if(i < arr.length -4) {
				System.out.print(sign);
			}
		}
		
		System.out.println();
		
	}
}
