package basic;

public class Factorial {

	public static void main(String[] args)
	{
		int ans = fact(5);
		System.out.println(ans);

	}
	
	static int fact(int n) {
		if(n<1) {
			return 1;
		}
		  int ans = fact(n-1)*n;
		  return ans;
	}

}
