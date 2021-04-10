package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/find-the-mth-element-of-the-array-after-k-left-rotations/?ref=leftbar-rightbar
 */
public class M_ElementsAfter_K_Rotations {
   public static void k_LeftRotations(int[] arr, int k) {
	   for(int i=0;i<k;i++)
		   rotate(arr);
	   System.out.println(Arrays.toString(arr));
   }
   public static void rotate(int[] arr) {
	   int temp = arr[0];
	   for(int i=0;i+1<arr.length;i++) 
		   arr[i] = arr[i+1];
		   
	  arr[arr.length-1] = temp;
   }
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		k_LeftRotations(arr, 3);
		int m = 2;
		System.out.println(arr[m-1]);

	}

}
