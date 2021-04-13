package Geeks.LinkedList;
/*
 * Cracking the coding interview page 55
 * Delete from Single Linked List
 */
public class Delete_SLL {
private Delete_SLL next;
private Delete_SLL prev;
private int data ;
Delete_SLL(int data){
	this.data = data;
}
public void addToTail(int data) {
	Delete_SLL node = new Delete_SLL(data);
	Delete_SLL current = this;
	while(current.next!=null)
		current = current.next;
	current.next = node;
	node= null;
}
public void print(Delete_SLL node) {
	while(node!=null) {
		System.out.print(node.data+" ");
		node = node.next;
	}
}
 
public void deleteByVal(int data) {
	Delete_SLL node = this;
	while(node.data!=data) {
		//System.out.println("yes, cause "+node.data+"!="+data);
		prev = node;
		node = node.next;
	}
	//System.out.println("PREV: "+prev.data+", current: "+node.data);
	prev.next = node.next;
	node=null;
}
public void deleteByLoc(int location) {
	Delete_SLL node = this;
	int pos=0;
	while(pos!=location) {
		pos++;
		prev = node;
		node = node.next;
	}
	prev.next = node.next;
	node=null;
	
}
	public static void main(String[] args) {
		Delete_SLL n1 = new Delete_SLL(5);
		n1.addToTail(10);
		n1.addToTail(15);
		n1.addToTail(20);
		n1.addToTail(25);
		n1.addToTail(30);
		n1.print(n1);
		n1.deleteByVal(5);
		System.out.println("\n");
		n1.print(n1);
		n1.deleteByLoc(4);
		System.out.println("\n");
		n1.print(n1);

	}

}
