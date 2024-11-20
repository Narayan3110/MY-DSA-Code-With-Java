package first;

public class BinarySearch {
	static Node root;  // created Root Node

	static void insert(Node temp, int data) {   //MEthod for Inserting node
		if (root == null) {    //creating root
			temp = new Node(data);
			root = temp;
			return;
		}
		
		//Condition for right nodes
		if (data > temp.data) {
			if (temp.right == null) {
				temp.right = new Node(data);
			} else {
				insert(temp.right, data);
			}
		}
		
		//conditions for right nodes
		else {
			if(data < temp.data) {
				if(temp.left == null) {
					temp.left = new Node(data);
				}else {
					insert(temp.left , data);
				}
			}
		}

	}
	
	
	//Printing in Inorder .
	static void inorder(Node temp) {
		if(temp != null) {
			inorder(temp.left);
			System.out.println(temp.data + " ");
			inorder(temp.right);
		}
	}
	
	//Printing in Pre order 
	static void preOrder(Node temp) {
		if(temp !=null) {
			System.out.println(temp.data + " ");
			inorder(temp.left);
			inorder(temp.right);
			
		}
	}
	//Printing in Postorder 
	static void postOrder(Node temp) {
		if(temp !=null) {
			
			inorder(temp.left);
			inorder(temp.right);
			System.out.println(temp.data + " ");
			
		}
	}

	public static void main(String[] args) {
		insert(root , 10);
		insert(root , 5);
		insert(root , 50);
		insert(root , 20);
		insert(root , 90);
		
		inorder(root);
		System.out.println("***************");
		System.out.println();
		
		preOrder(root);
		System.out.println("***************");
		System.out.println();
		
		postOrder(root);
		System.out.println("***************");
		System.out.println();

	}
}

class Node {   //Creating our own node 
	int data;  
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}