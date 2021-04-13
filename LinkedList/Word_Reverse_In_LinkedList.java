package Geeks.LinkedList;

import Geeks.LinkedList.K_Rotations.Node;

/*
 * https://www.geeksforgeeks.org/reverse-word-linked-list-node/
 */
public class Word_Reverse_In_LinkedList {
	private Node head;
  class Node{
	  Node next;
	  int data;
	  Node(){}
	  Node(int data){
		  this.data = data;
		  this.next = null;
	  }
  }
  public Node push2(Node node, int data) {
	  if(node==null)
		  return new Node(data); 
	  else
		  node.next = push2(node.next, data);
	  return node;
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
		Word_Reverse_In_LinkedList rotations = new Word_Reverse_In_LinkedList();
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
		
		
	}

}
