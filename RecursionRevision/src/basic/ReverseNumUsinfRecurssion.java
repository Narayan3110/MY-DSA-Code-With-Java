package basic;

public class ReverseNumUsinfRecurssion
{
	public static void main(String[] args) 
	{
		int n = 12345;
		int rn= rev(n);
		System.out.println(rn);
	}
	
	static int rev(int n ) {
		
		if(n ==0) {
			return 1;
		}
		
		 int a= n % 10 + rev(n/10);
		 return a ;
	}
}
