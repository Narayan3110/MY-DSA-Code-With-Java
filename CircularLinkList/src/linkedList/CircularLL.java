package linkedList;

public class CircularLL {
	//object of new node
	Node start;      //my starting of circular linked list
	
	void InsertAtBegin(int data) {
		Node current = new Node(data);
		//Conditions:1.No Node is there
		if(start == null) {
			start = current ; //Made the new node as my first
			start.next = start; //given the reference to the first node of itself
			return;
		}
		//if node exists then
		else {
			Node temp= start;
			while(temp.next != start) {
				temp = temp.next;
			}
			
			temp.next = current;
			current.next = start;
			start =current;
		
		}
	}
	
	void InsertAtEnd(int data){
		Node current = new Node(data);
		if(start==null){
			System.out.println("List is empty");
			return;
		}
		else {
			Node temp = start;
			while(temp.next !=start) {
				temp = temp.next;
			}
			
			temp.next = current;
			current.next = start;
			
		}
	}
	
	 void display() {
	        if (start == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        
	        Node temp = start;
//	        do {
//	            System.out.print(temp.data + " --> ");
//	            temp = temp.next;
//	        } while (temp != start);  // Stop when we reach the start node again
//	        System.out.println("(head)");  // Indicate the circular nature
//	    }
	        
	        while(true) {
	        	
	        	System.out.print(temp.data+"--");
	        	temp = temp.next;
	        	
	        	if(temp==start) {
	        		System.out.println("head");
	        		break;
	        	}
	        }
	 }
	public static void main(String[] args)
	{
		CircularLL cl = new CircularLL();
		cl.InsertAtBegin(10);
		cl.InsertAtBegin(20);
		cl.InsertAtBegin(30);
		cl.InsertAtBegin(40);
		cl.InsertAtBegin(50);
		cl.InsertAtEnd(100);
		cl.display();

	}
	

}



//Creating a new node
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
