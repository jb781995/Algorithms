package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/array-rotation/
 */
public class ArrayRotation {

	public static void leftRotate(int [] arr, int d, int n) {
		for(int i =0 ;i<d ;i++)
		   leftRotateByOne(arr, n);	
	}
	
	public static void leftRotateByOne(int [] arr, int n) {
		int temp = arr[0];
		int  i=0;
		for(i =0;i<n-1;i++)
			arr[i] = arr[i+1];
		arr[i] = temp;
	}
	
	public static void reverseLeftRotate(int [] arr, int d, int n) {
		for(int i=0;i<d;i++)
			reverseLeftRotatebyOne(arr, n);
	}
	//{3,4,5,6,7,1,2} 
	public static void reverseLeftRotatebyOne(int [] arr, int n) {
		int temp = arr[n-1];
		int k = 0;
		int end = n-1;
		for(int i=n-1;i>0;i--) {
			k = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = k;
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int n= arr.length;
		leftRotate(arr, 3, n);
		
		//remember we are not returning the array from the method. Its the array which was 
		//updated there within the method and still here it shows all the changes. This is 
		// contrary to the true concept of Java being pass by value and still being able to behave as pass by reference
		System.out.println(Arrays.toString(arr));
		
		reverseLeftRotate(arr, 3, n);
		System.out.println(Arrays.toString(arr));
		
		// this is also the logic for cyclic rotation of array
		reverseLeftRotate(arr, 1, n);
		System.out.println(Arrays.toString(arr));

	}

}
