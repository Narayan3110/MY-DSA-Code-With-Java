public class Balance
{
	static char arr[] =  new char[20];
	static int top = -1 ;
	public static void main(String[] args)
	{
		String str = "(this[is](valid))";
		
		check(str);
		peak();
	}
	
	static void check(String str) {
		for(int i = 0 ; i < str.length() ; i++) {
			
			if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ) {
				push(str.charAt(i));
			}
			
//			if(str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']' ) {
//				
//			}
		}
	}


	public static void push(char charAt) 
	{
		if(top == -1) {
			arr[++top] = charAt;			
		}
	}
	
	public static void peak() {
		System.out.println(top);
	}
}