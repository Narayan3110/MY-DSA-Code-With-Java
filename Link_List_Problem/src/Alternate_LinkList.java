
public class Alternate_LinkList {

	static Node head ;
	static Node start;
	
	//Node insertion at start
	static void insertNode(int data) {
	if(head == null) {
		 start = new Node(data);
		head = start;
		
	}else {
		Node current =  new Node(data);
		current.next = head;
		head = current;
				
		
	}
}
	
	//display Normally
	static void display() {
		Node temp = head ;
		if(start == null) {
			System.out.println("Empty list");
		}else {
			while(temp!= null) {
				System.out.print(temp.data + "--");
				temp = temp.next;
				
			}
			
		}
		
	}
	

	//Display method for alternate LinkList ;
	static void displayAlternate() {
		Node temp = head ;
		if(head == null) {
			System.out.println("Empty list");
		}else {
			while(temp != null) {
				System.out.print(temp.data+"--");
				temp = temp.next.next;
			}
		}
	}
	public static void main(String[] args) 
	{
		
		insertNode(10);
		insertNode(20);
		insertNode(30);
		insertNode(40);
		insertNode(50);
		insertNode(60);
		insertNode(70);
		insertNode(80);
		
		display();
		
		System.out.println();
		displayAlternate();
	}

}


class Node
{
	int data ;
	Node next ;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}