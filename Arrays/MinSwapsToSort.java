package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/minimum-number-of-swaps-required-to-sort-an-array-of-first-n-number/?ref=leftbar-rightbar
 */
public class MinSwapsToSort {
	// this was my approach. A bit lengthy, but different. We'll try to finish this too.. Later
  public static void minSwaps(int [] arr) {
	  int k = arr.length;
	  int [] displaced = new int [k];
	  for(int i=0;i<arr.length;i++) 
		  displaced[i] = Math.abs(arr[i]-(i+1));
	  System.out.println(Arrays.toString(displaced));
  }
  
  public static int swaps(int [] arr) {
	  int count=0, i=0;
	  while(i<arr.length) {
		  if(arr[i]!= i+1) {
			  //i+1 coz, we are counting index from 1 and not 0
			  while(arr[i]!=i+1) {
				  int temp = arr[arr[i]-1];
				  arr[arr[i]-1] = arr[i];
				  arr[i] = temp;
				  count++;
			  }
		  }
		  i++;
	  }
	  return count;
  }
	public static void main(String[] args) {
		int [] arr = { 7, 1, 3, 2, 4, 5, 6 };
		/*
		 * initially: {7,1,3,2,4,5,6}
		 * {6,1,3,2,4,5,7}
		 * {5,1,3,2,4,6,7}
		 * {4,1,3,2,5,6,7}
		 * {2,1,3,4,5,6,7}
		 * {1,2,3,4,5,6,7}
		 */
		System.out.println(swaps(arr));
	}

}
