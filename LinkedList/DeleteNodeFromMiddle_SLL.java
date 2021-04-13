package Geeks.LinkedList;
/*
 * Cracking the coding interview page 56
 * delete from the middle of the list given only the access of that node
 */
public class DeleteNodeFromMiddle_SLL {
private DeleteNodeFromMiddle_SLL next;
private DeleteNodeFromMiddle_SLL prev;
private int data;

DeleteNodeFromMiddle_SLL(int data){
	this.data= data;
}
public DeleteNodeFromMiddle_SLL addToTail(int data) {
	DeleteNodeFromMiddle_SLL node = new DeleteNodeFromMiddle_SLL(data);
	DeleteNodeFromMiddle_SLL current = this;
	 /*
	    This is different than Delete_SLL approach where we started referencing
	    prev in the delete function. That was possible because we were iterating
	 	from the beginning. Here we are trying to delete directly from the location
	 	without iterating based on the reference passed hence it becomes necessary
	 	to have prev and next references of each instance ready at the time of creation
	 */
	node.prev = current;
	while(current.next!=null)
		current=current.next;
	current.next = node;
	node.next = null;
	return node;
	}

public void print() {
	DeleteNodeFromMiddle_SLL node=this;
	int count =0;
	while(node!=null) {
		if(count>0) {
		System.out.println(node.data+", PREV:  "+node.prev.data);
		}
		else
		System.out.println(node.data+" ");
		count++;
		node=node.next;
	}
}

// This is out solution. One complete solution
public void deleteFromNthPos(DeleteNodeFromMiddle_SLL node) {
	DeleteNodeFromMiddle_SLL temp = node.next;
	// when trying to delete directly the last node
	if(node.next==null) {
		node.prev.next = null;
		return;
	}
	// when trying to delete the first node
	else if(node.prev ==null) {
		node.next.prev = null;
		return;
	}
	/*
	 * these below steps looks funny but are the most essential
	 */
	node.next.prev = node.prev;
	node.prev.next = temp;
}

	public static void main(String[] args) {
		DeleteNodeFromMiddle_SLL n1 = new DeleteNodeFromMiddle_SLL(5);
		DeleteNodeFromMiddle_SLL n2 =n1.addToTail(10);
		DeleteNodeFromMiddle_SLL n3 =n2.addToTail(15);
		DeleteNodeFromMiddle_SLL n4 =n3.addToTail(20);
		DeleteNodeFromMiddle_SLL n5 =n4.addToTail(25);
		DeleteNodeFromMiddle_SLL n6 =n5.addToTail(30);
		DeleteNodeFromMiddle_SLL n7 =n6.addToTail(35);
		n1.print();
		n4.deleteFromNthPos(n1);
		System.out.println("\n");
		n2.print();
		
		
	}

}
