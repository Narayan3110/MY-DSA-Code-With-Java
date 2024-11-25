public class stack 
{
	int arr[] ;
	int capacity ;
	int top ; //empty stack
	
	public stack(int size) {
		super();
		capacity = size ;
		arr = new int[size];
		this.top = -1;
	}
	
	public static void main(String[] args)
	{
		stack s = new stack(10);
		s.push(10);
		s.push(20);		
		s.peek();
	}

	public void peek() {
		System.out.println(arr[top]);
		
	}

	public void pop() {
		if(isEmpty()) {
		System.out.println("Empty list");	
		}else {
			top--;		
		}
		
	}

	public boolean isEmpty() {
		
		return top==-1;
	}

	public void push(int i) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		arr[++top] = i ;
				
	}
	
	

	private boolean isFull() {
		
		return top == capacity-1;
	}
	
	
}
