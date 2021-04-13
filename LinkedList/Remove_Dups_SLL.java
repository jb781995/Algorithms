package Geeks.LinkedList;

import java.util.Hashtable;

/*
 * Cracking the coding interview page 55
 * Delete from Single Linked List
 */
public class Remove_Dups_SLL {
private Remove_Dups_SLL next;
private int data;
Remove_Dups_SLL(int data){
	this.data = data;
}
public void addToTail(int data) {
	Remove_Dups_SLL node = new Remove_Dups_SLL(data);
	Remove_Dups_SLL current = this;
	while(current.next!=null)
		current = current.next;
	current.next = node;
	node.next =null;
}

public void print(Remove_Dups_SLL node) {
	while(node!=null) {
		System.out.print(node.data +" ");
		node= node.next;
	}
}

// below uses a buffer i.e Hashtable which takes extra memory for storing
// all the elements so far
public void removeDups(Remove_Dups_SLL node) {
	Hashtable table = new Hashtable();
	Remove_Dups_SLL prev = null;
	while(node!=null) {
		if(!table.containsKey(node.data)) {
			table.put(node.data, true);
			//prev = node;
		}
		else {
			prev.next = node.next;
		}
		prev = node;
		node = node.next;
	}
}

// below is without using the buffer
public void removeDups2(Remove_Dups_SLL head) {
	Remove_Dups_SLL prev= head;
	Remove_Dups_SLL current = head.next;
	while(current!=null) {
		Remove_Dups_SLL runner = head;
		while(runner!=current) {
			if(runner.data == current.data) {
				Remove_Dups_SLL temp = current.next;
				current = temp;
				prev.next = current;
				break;
			}
			runner = runner.next;
		}
				//this condition is met when we have run all the way until current
				// without observing any duplicate and therefore we update the 
				// current and prev here because had we found any dup inside before
				// current we would've already updated the current to the current.next
				// and runner would not be equal to current i.e it would be pointing to
				// an object behind current, so the below if won't satisfy
		if(runner == current) {
			prev = current;
			current = current.next;
		}
	}
}

	public static void main(String[] args) {
		Remove_Dups_SLL n1 = new Remove_Dups_SLL(5);
		n1.addToTail(10);
		n1.addToTail(15);
		n1.addToTail(20);
		n1.addToTail(25);
		n1.addToTail(30);
		n1.addToTail(30);
		n1.addToTail(15);
		n1.removeDups2(n1);
		System.out.println();
		n1.print(n1);

	}

}
