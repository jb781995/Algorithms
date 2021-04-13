package Geeks.LinkedList;
/*
 * Cracking the coding interview, page - 55
 */
public class Single_Linked_List {
private Single_Linked_List end;
private int data;
Single_Linked_List(int data){
	this.data = data;
}
public void addToTail(int data) {
	Single_Linked_List node = new Single_Linked_List(data);
	Single_Linked_List current = this;
	while(current.end!=null) {
		current = current.end;
	}
		current.end = node;
		//node.end = null;
}
public void print(Single_Linked_List node) {
	while(node!=null) {
		System.out.print(node.data+" ");
		node = node.end;
	}
		
}
	public static void main(String[] args) {
		Single_Linked_List n1 = new Single_Linked_List(5);
		n1.addToTail(10);
		n1.addToTail(15);
		n1.addToTail(20);
		n1.addToTail(25);
		n1.addToTail(30);
		n1.print(n1);
	}

}
