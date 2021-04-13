package Geeks.LinkedList;

public class Delete_SLL2 {
private int data;
private Delete_SLL2 next;
Delete_SLL2(int data){
	this.data = data;
}
public void addNode(int data) {
	Delete_SLL2 node = new Delete_SLL2(data);
	Delete_SLL2 head = this;
	while(head.next!=null) 
		head = head.next;
	head.next = node;
	node.next = null;
}

// delete function always has to return the node type i.e head of the node
// because we need a new head returned in case of the deletion of the first node.
public Delete_SLL2 deleteByVal(int val) {
	//int data = this.data;
	Delete_SLL2 prev = null;
	Delete_SLL2 current = this;
	Delete_SLL2 head = current;
	while(current.data!=val) {
		prev = current;
		current = current.next;
	}
	if(prev == null) {
		Delete_SLL2 temp = current.next;
		current = null;
		return temp;
		}
	else
		prev.next = current.next;
	return head;
}

// you can try the below version too. it is shorter and looks cleaner
public Delete_SLL2 deleteByVal(Delete_SLL2 head, int val) {
	// 5 ->10 ->15 ->20 ->22
	Delete_SLL2 n = head;
	if(n.data == val) 
		return head.next; // if the first node is to be removed, then simply return its next
	
	while(n.next!=null) {
		if(n.next.data == val) {
			n.next = n.next.next;
			//break and return head because head didn't change
			break;
		}
		n = n.next;
	}
	return head;
}
public void print() {
	Delete_SLL2 node = this;
	while(node!=null) {
		System.out.print(node.data+"  ");
		node = node.next;
	}
}
	public static void main(String[] args) {
		// 5->10->15->20->22
		Delete_SLL2 head = new Delete_SLL2(5);
		head.addNode(10);
		head.addNode(15);
		head.addNode(20);
		head.addNode(22);
		head = head.deleteByVal(22);
		head = head.deleteByVal(head, 5);
		head.print();
		

	}

}
