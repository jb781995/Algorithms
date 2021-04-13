package Geeks.LinkedList;
/*
 * Cracking the coding interview page 56
 * Nth to the Last element in Single Linked List
 */
public class NthToLast_SLL {
private NthToLast_SLL next;
private int data;

NthToLast_SLL(int data){
	this.data = data;
}
public void addToTail(int data) {
	NthToLast_SLL newNode = new NthToLast_SLL(data);
	NthToLast_SLL current = this;
	while(current.next!=null)
		current=current.next;
	current.next = newNode;
	newNode.next= null;
}
public void print() {
	NthToLast_SLL node = this;
	while(node!=null) {
		System.out.print(node.data+" ");
		node=node.next;
	}
}
public NthToLast_SLL nthToLast(NthToLast_SLL head, int loc) {
	if(head==null || loc<1)
		return null;
	NthToLast_SLL p1 = head;
	NthToLast_SLL p2 = head;
	for(int i=0;i<loc;i++) {
		if(p2.next ==null)
			return null;
		p2 = p2.next;
	}
	while(p2.next!=null) {
		p1=p1.next;
		p2=p2.next;
	}
	return p1;
}

	public static void main(String[] args) {
		NthToLast_SLL n1 = new NthToLast_SLL(5);
		n1.addToTail(10);
		n1.addToTail(15);
		n1.addToTail(20);
		n1.addToTail(25);
		n1.addToTail(30);
		n1.addToTail(35);
		n1.addToTail(40);
		n1.print();
		System.out.println();
		NthToLast_SLL p1 = n1.nthToLast(n1, 4);
		p1.print();

	}

}
