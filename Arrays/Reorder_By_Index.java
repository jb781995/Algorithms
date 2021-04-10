package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/?ref=lbp
 */
public class Reorder_By_Index {
	// arr = {50, 40, 70, 60, 90}
	// index = {3,  0,  4,  1,  2}
   public static void reorder(int [] arr, int[] index) {
	   for(int i=0;i<arr.length;i++) {
		   while(index[i]!=i) {
			   int I = index[index[i]]; // save the index
			   char E = (char)arr[index[i]]; // save its corresponding element
			   System.out.println("\n\nindex[index["+i+"]]: "+I+", arr[index["+i+"]]: "+(int)E);
			   
			   arr[index[i]] = arr[i];
			   index[index[i]] = index[i];
			   //System.out.println(Arrays.toString(arr)+"                  "+Arrays.toString(index));
			   
			   index[i] = I;
			   arr[i] = E;
			   System.out.println("index["+i+"]:"+I+",  arr["+i+"]:"+(int)(E)+"         "+Arrays.toString(arr)+"                  "+Arrays.toString(index));
			   
		   }
	   }
   }
	public static void main(String[] args) {
		int[] arr= {50, 40, 70, 60, 90};
		int [] index = {3,  0,  4,  1,  2};
		
		reorder(arr, index);

	}

}
