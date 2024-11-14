package array;

public class Stack_Using_Array 
{
	int arr[];
	int capacity = 6;
	int top = -1;
	
	public Stack_Using_Array(int size) {
		
		capacity = size;
		arr = new int[size] ;
		top = -1;
		
	}
	public static void main(String[] args) {
		
		Stack_Using_Array sa = new Stack_Using_Array(10);
//		sa.push(10);
//		sa.push(20);
		sa.pop();
//		sa.peek();
	}
	
	void push(int data) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}else {
			arr[++top] = data;
		}
		
		
	}
	
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		top--;
	}
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}else {
			System.out.println(arr[top]);
		}
		
	}
	
	 boolean isEmpty() {
		
		return top == -1;
	}
	 
	 boolean isFull() {
		 return top == capacity-1;
	 }
}
