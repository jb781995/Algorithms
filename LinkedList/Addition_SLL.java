package Geeks.LinkedList;
// Cracking the coding interview ex 2.4
public class Addition_SLL {
private Addition_SLL next;
private int data;
Addition_SLL(int data){
	this.data = data;
}
public void addNode(int data) {
	Addition_SLL node = new Addition_SLL(data);
	Addition_SLL current = this;
	while(current.next!=null)
		current = current.next;
	current.next = node;
	node.next = null;
}



	public static void main(String[] args) {
		// 3 ->1 ->5 + 
		// 5 ->9 ->2 = 
		// 8 ->0 ->8 

	}

}
