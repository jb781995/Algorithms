package Geeks.Arrays;

import java.util.Arrays;

public class Insertion_Sort {
 public static void insertionSort(int [] arr) {
	 for(int i=1;i<arr.length;i++) {
		 int val = arr[i];
		 int j =i-1;
		 while(j>=0 && arr[j]>val) {
			 arr[j+1] = arr[j];
			 j--;
		 }
		 arr[j+1] = val;
	 }
	 System.out.println(Arrays.toString(arr));
 }
	public static void main(String[] args) {
		int [] arr = {20, 10, 40, 30};
		insertionSort(arr);
		
		int [] arr2 = {1,2,3,4,5,6,7};
		int j = 3;
		arr2[j+1] = 500;
		System.out.println("        "+Arrays.toString(arr2)+", j: "+j);

	}

}
