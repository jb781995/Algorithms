package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/rearrange-array-arrj-becomes-arri-j/
 */
public class Rearrange_Based_On_Indices {
	// this is simple approach in O(n) and extra space
  public static void rearrange(int [] arr) {
	  int [] temp = new int[arr.length];
	  
	  for(int i=0;i<arr.length;i++)
		  temp[arr[i]] = i;
	  
	  System.out.println(Arrays.toString(temp));
  }
  
//this is simple approach in O(n) and O(1) auxiliary space
  public static void rearrange2(int [] arr) {
	  
  }
	public static void main(String[] args) {
		int [] arr= {2,0,1,4,5,3};
		rearrange(arr);

	}

}
