package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/?ref=lbp
 */
public class MergeTwoArrays {

	public static void moveToEnd(int [] arr, int size) {
		int i, j = size - 1;
		for(i = size - 1; i>=0; i--) {
			if(arr[i]!=-1) {
				arr[j] = arr[i];
				j--;
			}
		}
	}
	
	/* there are two sorted arrays.. 
	 * {2, 8, -1, -1, -1, 13, -1, 15, 20}; 
	 * {5, 7, 9, 25} 
	 */
	
	public static void merge(int[] M, int[] N, int size_m, int size_n) {
		int i = size_n;
		int j = 0;
		int k = 0;
		
		while(k<(size_m+size_n)) {
			if(i<(size_m+size_n)&& M[i]<=N[j] || j==size_n) {
				M[k] = M[i];
				k++;
				i++;
			}
			else {
				M[k] = N[j];
				k++;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int [] M = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int [] N = {5, 7, 9, 25}; 
        int n = N.length;
        int m = M.length - n;
        int size = m+n;
        
        moveToEnd(M, size);
        System.out.println(Arrays.toString(M));
        
        merge(M,N,m,n);
        System.out.println(Arrays.toString(M));
	}

}
