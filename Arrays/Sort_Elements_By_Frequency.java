package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/sort-elements-by-frequency-set-2/
 * For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}, then modify the array to {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}.
 *                                    {2, 2, 2, 3, 3, 3, 3, 4, 5, 12, 12}
*/
public class Sort_Elements_By_Frequency {
	class Node{
		Node left, right;
		int data, freq;

		Node(int data){
	     this.data = data;
	     this.left = null;
	     this.right = null;
	     this.freq = 1;
		}

	}

	class DataFreq{
		int data, freq;
	}
	
	//{2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}; 
	 Node insert(Node root, int data){
		if(root == null)
		  return new Node(data);
		if(data == root.data) // if already present
		  root.freq+=1;
		else if(data< root.data)
		  root.left = insert(root.left, data);
		else
		  root.right = insert(root.right, data);
		return root;
	}
	
	 public void printBST(Node root) {
		 while(root!=null) {
			 System.out.println("->"+root.right.data);
			 root = root.right;
		 }
	 }
	
	public static void store(Node root, DataFreq [] count, int index){
		if(root==null)
		  return ;
		//recur for left subtree
		store(root.left, count, index);

		//store item from root and increment index
		count[index].freq = root.freq;
		count[index].data = root.data;
		index++;

		//recur for right subtree
		store(root.right, count, index);
	}
	
	public static void sortByFrequency(int [] arr, int n){
		Node root= null;
		Sort_Elements_By_Frequency sort = new Sort_Elements_By_Frequency();
		for(int i=0;i<n;i++)
		  root = sort.insert(root, arr[i]);
		System.out.println("initially: "+Arrays.toString(arr)+" Root: "+root.data+"\n root.right: "+root.right.data);
		sort.printBST(root);

		//create an auxiliary array 'count[]' to store data and 
		//frequency pairs. The maximum size of this array would
		//be n when all elements are different
		DataFreq [] count = new DataFreq[n];
	    int index =0;
	    store(root, count, index);

	    //sort the count[] according to frequency(or count) 
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}; 
		int n = arr.length-1;
		sortByFrequency(arr, n);

	}

}
