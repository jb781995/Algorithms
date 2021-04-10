package Geeks.Arrays;

import java.util.Arrays;

public class ReverseArray_String {
 public static void reverseArray(int [] arr) {
	 int start=0;
	 int end= arr.length-1;
	 int temp = 0;
	 for(int i=0;i<arr.length/2;i++) {
		 temp = arr[end];
		 arr[end] = arr[start];
		 arr[start] = temp;
		 start++;
		 end--;
	 }
 }
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
