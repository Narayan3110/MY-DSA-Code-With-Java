import java.util.Scanner;

public class Parenthesis {
	static int top = -1;
	static char[] arr;

	public Parenthesis(int size) {

		this.arr = new char[size];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		Parenthesis paran = new Parenthesis(str.length());

		System.out.println(paran.check(str));
	}

	static boolean check(String str) {

		for (int i = 0; i < str.length(); i++) {
			char chaa = str.charAt(i);
			if (chaa == '(' || chaa == '{' || chaa == '[') {
				push(chaa, str);
			} else if (chaa == ')' || chaa == '}' || chaa == ']') {
				char ch = peek();
				if (chaa == ')' && ch == '(' || chaa == '}' && ch == '{' || chaa == ']' && ch == '[') {
					pop();
				} else {
					return false;
				}
			}
		}
		return top == -1 ;

	}

	static void push(char a, String str) {

		arr[++top] = a;
	}

	static char peek() {
		
		return arr[top];
	}

	static void pop() {
		--top;
	}
}