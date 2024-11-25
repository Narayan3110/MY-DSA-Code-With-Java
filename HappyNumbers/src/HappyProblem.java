
public class HappyProblem {
	public static void main(String[] args) {
		int n = 16;
		System.out.println(checkn(n));
		
	}

	private static boolean checkn(int n) {
		int count = 0;
		
		while (count < 10) {
			
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n = n / 10;
			}
			n = sum;
			if (n == 1) {
				return true;
			}

			count++;
			
		}
		
		return false;
		
	}

}
