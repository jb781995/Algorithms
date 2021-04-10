package Geeks.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://www.geeksforgeeks.org/range-sum-queries-for-anticlockwise-rotations-of-array-by-k-indices/
 */
public class K_Rotations_And_Sum {

	public static void rotateAndSum(int[] arr, int[][] query) {
		List<Integer> result = new ArrayList<Integer>();
		int k=0,l=0,r=0;
		for(int i=0;i<query.length;i++) {
			if(query[i][0] == 1) {
				k = query[i][1];
				rotate(arr, k);
			}
			else if(query[i][0] == 2) {
				l = query[i][1];
				r = query[i][2];
				result.add(sum(arr, l,r));
			}
	}
		
		System.out.println(result);
	}
	
	public static void rotate(int [] arr, int k) {
		for(int i=0;i<k;i++)
			rotateUtil(arr);
	}
	
	public static void rotateUtil(int [] arr) {
		int temp = arr[0];
		for(int i=0;i+1<arr.length;i++)
			arr[i] = arr[i+1];
		arr[arr.length-1] = temp;
	}
	
	public static int sum(int [] arr, int l, int r) {
		int sum = 0;
		for(int i = l; i <=r;i++)
			sum+=arr[i];
		return sum;
	}
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		int [][]query = { 
				{ 2, 1, 3 }, 
                { 1, 3 }, 
                { 2, 0, 3 }, 
                { 1, 4 }, 
                { 2, 3, 5 } 
                }; 

		rotateAndSum(arr, query);
	}

}
