package recursion;

public class Palindrom {

	public static void main(String[] args) {
		String str = "madam";
		
		check(str , 0 , str.length()-1);
		
	}
	

	 static boolean check(String str, int start, int end) 
	{
		
		 if(start >= end) {
			 return true;
		 }
		
		 if(str.charAt(start) != str.charAt(end)) {
			 start++;
			 end--;
		 }
		 
		 return true;
	}
	
	


}
