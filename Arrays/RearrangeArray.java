package Geeks.Arrays;
/*
 * https://www.geeksforgeeks.org/rearrange-array-arri/
 */
import java.util.Arrays;

public class RearrangeArray {
  public static int[] rearrange(int [] arr) {
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]!=-1 && arr[i]!=i) {
			  int x = arr[i];
			  //check if the desired place is vacate
			  while(arr[x]!=-1 && arr[x]!=x) {
				  int y = arr[x];
				  arr[x] = x;
				  x = y;
			  }
			  
			  // place x on its correct position if there is -1 at that position
			  arr[x] = x;
			  
			  // if while loop hasn't put correct value at index i, put -1 there.
			  if(arr[i]!=i)
				  arr[i] = -1;
		  }
	  }
	  return arr;
  }
	public static void main(String[] args) {
		int A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4,-1}; 
		System.out.println("  "+Arrays.toString(rearrange(A)));

	}

}
