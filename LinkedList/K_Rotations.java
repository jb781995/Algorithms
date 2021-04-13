 package Geeks.LinkedList;
/*
 * https://www.geeksforgeeks.org/clockwise-rotation-of-linked-list/
 * full proof solution, developed totally by me: 10 AUG 2020
 * I changed and created another method push2. much smaller and works the same
 */
public class K_Rotations {
   class Node{
	  int data;
	  Node  next;
	  Node(){}
	  Node(int data){
		  this.data = data;
		  this.next = null;
	  }
  }
   Node head;
  void push(Node node, int data) {
	  if(head == null) {
		  head = new Node();
		  head.data = data;
		  //System.out.println(head.data);
	  }
	  else {
		 Node p = null;
		 while(node!=null) {
			  p = node;
			  node = node.next;
		 }
		 node = new Node();
		 node.data = data;
		 p.next = node;
	  }
  }
  
  // simpler recursive approach than above. Above has a lot of code
  // this is more readable and clean
   Node push2(Node root, int data) {
	  if(root == null)
		  return new Node(data);
	  else
		 root.next =  push2(root.next, data);
	  return root;
  }
  
  void leftRotate(Node node, int k) {
	  if(node==null)
		  return;
	  if(node.next == null)
		  return;
	  
	  int len = 1;
	  Node n ;
	  while(node.next!=null) {
	     node = node.next;
	     len++;
	  }
	  
	  for(int i =0;i<k;i++)
		  leftRotateUtil(head);
	  new K_Rotations().printList(head); 
  }
  
  void leftRotateUtil(Node node) {
	  
	  while (node.next != null) 
       node = node.next; 
      
	  
	  Node newHead = head;
	  head= head.next;
	  node.next = newHead;
	  newHead.next = null;
	  
	 //System.out.println("\nafter rotation new linked list: ");
	 //new K_Rotations().printList(head);
	  
  }
  
   void printList(Node node) 
  { 
      while (node != null) 
      { 
          System.out.print(node.data + " -> "); 
          node = node.next; 
      } 
      System.out.print( "null"); 
  } 
  
	public static void main(String[] args) {
		//Node.head = null;
		K_Rotations rotations = new K_Rotations();
//		rotations.push(rotations.head,1);
//		rotations.push(rotations.head,2);
//		rotations.push(rotations.head,3);
//		rotations.push(rotations.head,4);
//		rotations.push(rotations.head,5);
//		rotations.push(rotations.head,6);
//		rotations.push(rotations.head,7);
//		rotations.push(rotations.head,8);
		
		rotations.head=rotations.push2(rotations.head,1);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,2);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,3);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,4);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,5);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,6);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,7);
		System.out.println("root returned with value: "+rotations.head.data);
		rotations.head=rotations.push2(rotations.head,8);
		System.out.println("root returned with value: "+rotations.head.data);
		
		
		rotations.printList(rotations.head);
	
		System.out.println("\n\nhead right now: "+rotations.head.data);
		rotations.printList(rotations.head);
		System.out.println("\n\nafter rotation:");
		rotations.leftRotate(rotations.head, 3);

	}

}
