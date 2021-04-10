package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
 */
public class Rearrange_Postitive_Negative {
  static void rearrange(int [] arr, int n) {
	  int i = -1, temp = 0;
	  // The following few lines are similar to partition 
      // process of QuickSort.  The idea is to consider 0 
      // as pivot and divide the array around it. 
	  for(int j=0;j<n;j++) {
		  //this if condition essentially works to accumulate all the negative values in the beginning of the array starting from 0th index
		  if(arr[j]<0) {
			  i++;
			  temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
		  }
	  }
	  
	  int pos = i+1, neg = 0;
	  System.out.println(Arrays.toString(arr)+"  , postitive starts from: "+pos+" and negative starts from: "+0);
	  System.out.println();
	  
	  while(pos <n && neg <pos && arr[neg] <0) {
		  temp = arr[neg];
		  arr[neg] = arr[pos];
		  arr[pos] = temp;
		  pos++;
		  neg+=2;
		  System.out.println(Arrays.toString(arr)+"  , postitive starts from: "+pos+" and negative starts from: "+0);
	  }
	  
	  System.out.println(Arrays.toString(arr));
  }
	public static void main(String[] args) {
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; 
		rearrange(arr, arr.length);

	}

}
