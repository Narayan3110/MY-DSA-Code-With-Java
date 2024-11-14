package recurrsion;

public class Fibonaci {

	public static void main(String[] args) {
		
		int a = fib(4);
		System.out.println(a);

	}
	
	static int fib(int n) {
		if (n < 2) {
			return n;
		}
	return fib(n-1) + fib(n-2);
	}

}
  