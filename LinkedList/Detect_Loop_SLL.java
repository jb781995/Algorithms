package Geeks.LinkedList;

public class Detect_Loop_SLL {
	
    Node head;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public Node push(Node root, int data, boolean flag) {
	   if(root == null)
		   return new Node(data);
	   else { 
		   root.next = push(root.next, data, flag);
	   }
	   return root;
	}
	
	public static void main(String[] args) {
		
		Detect_Loop_SLL loop = new Detect_Loop_SLL();
		loop.head = loop.push(loop.head, 1, false);
		loop.head = loop.push(loop.head, 2, false);
		loop.head = loop.push(loop.head, 3, true);
		loop.head = loop.push(loop.head, 4, false);
		loop.head = loop.push(loop.head, 5, false);
	}

}
