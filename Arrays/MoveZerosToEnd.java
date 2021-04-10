package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/
 */
public class MoveZerosToEnd {
   static void moveZerosToEnd(int [] arr, int n) {
	   //count of zeros
	   int count =0;
	   int temp;
	   
	   for(int i=0;i<n;i++) {
		   if(arr[i]!=0) {
			   temp = arr[i];
			   arr[i] = arr[count];
			   arr[count] = temp;
			   count++;
		   }
	   }
	   
   }
	public static void main(String[] args) {
		int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 
                7, 0, 6, 0, 9};
		//{1, 2, 0, 0, 0, 3, 6}
		moveZerosToEnd(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		

	}

}
