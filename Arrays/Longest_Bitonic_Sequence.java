package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/longest-bitonic-subsequence-dp-15/
 */
public class Longest_Bitonic_Sequence {
public static int lbs(int [] arr, int n) {
	int [] t = new int[n];
	for(int i=0;i<n;i++)
		t[i] = 1;
	// this is for finding longest increasing subsequence
	for(int i=1;i<n;i++) 
		for(int j=0;j<i;j++)
			if(arr[i]>arr[j] && t[i]<t[j]+1) {
				t[i] = t[j]+1;
				System.out.println(Arrays.toString(t));
			}
	System.out.println("LCS: "+Arrays.toString(t));
	int [] tt = new int [n] ;
	for(int i=0;i<n;i++)
		tt[i] = 1;
	System.out.println("\n\n\n");
	// this is for finding longest decreasing subsequence
		for(int i=n-2;i>=0;i--) 
			for(int j=n-1;j>i;j--)
				if(arr[i]>arr[j] && tt[i] < tt[j]+1){
	               tt[i] = tt[j] +1;
	               System.out.println(Arrays.toString(tt));
				}
		System.out.println("LDS: "+Arrays.toString(tt));
		
		// return the max value from t[0]+tt[0]-1
		int max = t[0]+tt[0]-1;
		for(int i=1;i<n;i++)
			if(t[i]+tt[i]-1>max)
				max = t[i]+tt[i]-1;
	
	
	return max;
}
	public static void main(String[] args) {
		int [] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int [] arr2= {0, 8, 4, 12, 2, 10};
		// t[] =     {1, 1, 1, 1, 1, 1}
		//           {1, 2, 1, 1, 1, 1}
		//           {1, 2, 2, 1, 1, 1}
		//           {1, 2, 2, 3, 1, 1}
		//           {1, 2, 2, 3, 2, 1}
		//           {1, 2, 2, 3, 2, 3}
		int n = arr.length;
		System.out.println("\n\n\nResult: "+lbs(arr, n));

	}

}
