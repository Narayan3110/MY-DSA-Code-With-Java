package LinkedList;

public class LinkedList {
	static LinkedList ll = new LinkedList();
	public static void main(String[] args) {
		ll.insertAtstart(10);
		ll.insertAtstart(20);
		ll.insertAtstart(30);
		ll.insertAtstart(40);
		ll.insertAtstart(50);
		ll.insertBefore(90 ,30);
		ll.insertAfter(80, 30);
		ll.display();
		
		
		
	}

	void display() {
		if(head == null) {
			System.out.println("Empty list");
		}
		else {
			Node temp = head;
			while(temp !=null) {   //check till the null because in singleton linked list the end element have the next value is null
				System.out.print(temp.data + "--");
				temp= temp.nextnode;
			
			}
		}
	}
	
	//places where we can add a data in linked list
//	1.Start
//	2.End
//	3.Before Element
//	4.After Elemment
	
	Node head;
	Node newnode;   //Created a new node 
	
	//insert data at the start of the list 
	void insertAtstart(int data)
	{
		 newnode= new Node(data);
		if(head == null) {
			head = newnode ; //set the head as new node if no head was present 
		}
		else {
			newnode.nextnode = head;
			head = newnode;
		}
	}
	
	
	//insert data in the end of list
	void insertAtEnd(int data) {
		newnode = new Node(data);
		Node temp =  head;
		if(head == null) {
			System.out.println("List is empty");
			insertAtstart(data);
		}else {
			while(temp.nextnode!=null) {
				temp=temp.nextnode;
			}
			temp.nextnode = newnode;
		}
	}
	
	//Insert After the element 
	void insertAfter(int data , int value) {
		newnode = new Node(data);
		if(head==null) {
			System.out.println("Empty list");
		}
		else {
			Node temp =head ;
			while(temp.nextnode != null && temp.data != value ) {
				temp = temp.nextnode;
			}
			
			newnode.nextnode = temp.nextnode;
			temp.nextnode = newnode;
		}
	}
	
	//Insert before the element
	void insertBefore(int data , int value) {
		newnode = new Node(data);
		if(head == null) {
			System.out.println("Empty list Adding new");
			insertAtstart(data);
			
		}
		
		else {
			Node temp = head;
			Node prev = null;
			while(temp.nextnode != null && temp.data != value) {
				prev =temp;
				temp = temp.nextnode;
			}
			newnode.nextnode = temp;
			prev.nextnode = newnode;
		}
	}

}


//my node 
class Node{
	int data ; //data in list
	Node nextnode;
	
	public Node(int data) {
	   this.data = data;
		nextnode = null;  //As new node will not have link to next node so 
	}
	
	
}