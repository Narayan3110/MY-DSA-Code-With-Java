package basic;

public class Reverse 
{
	public static void main(String[] args)
	{
		int n = 5;
		
//		rev(n);
		
		frw(n);
		
	}
	
	static void rev(int n)
	{	
		if(n==0) {
			return;
		}
		
		System.out.print( n+" ");
		rev(n-1);
	}
	
	static void frw(int n)
	{
		if(n == 0) {
			return;
		}
		frw(n-1);
		System.out.print(n);
	}

}


