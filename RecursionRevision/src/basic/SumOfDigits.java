package basic;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int n = 1342;
				
		int ans = sum(n);
		System.out.println(ans);
	}
	
	static int sum(int n) 
	{
		if(n==0) {
			return 0;
		}
		
		return sum(n/10) + n % 10 ;
		
	}
}
