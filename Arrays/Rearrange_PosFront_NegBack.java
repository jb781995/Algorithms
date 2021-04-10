package Geeks.Arrays;
/*
 * https://www.geeksforgeeks.org/move-ve-elements-end-order-extra-space-allowed/
 * https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 */
import java.util.Arrays;

public class Rearrange_PosFront_NegBack {
	
	public static void rearrange(int [] arr) {
		int j=0;
		outer:for(int i=0;i<arr.length;i++) {
			//System.out.println("**** "+i);
			if(arr[j]<0) {
				int t = j;
				//j++;
				while(arr[j]<0) { 
					if (j<arr.length-1)
						j++;
					else
					break outer;
				}
				i=util(arr, t, j);
				j=i+1;
			}
			else
				j++;
		}
		System.out.println("Result: "+Arrays.toString(arr));
	}
	
	public static void rearrangeZerosOnes(int [] arr) {
		int j=0;
		outer:for(int i=0;i<arr.length;i++) {
			//System.out.println("**** "+i);
			if(arr[j]==1) {
				int t = j;
				//j++;
				while(arr[j]==1) { 
					if (j<arr.length-1)
						j++;
					else
					break outer;
				}
				i=util(arr, t, j);
				j=i+1;
			}
			else
				j++;
		}
		System.out.println("Result: "+Arrays.toString(arr));
	}
	
	public static int util(int [] arr, int i, int j) {
		for(int k=j;k>i;k--) {
			int temp = arr[k];
			arr[k] = arr[k-1];
			arr[k-1] = temp;
		}
		System.out.println("       "+Arrays.toString(arr));
		return i;
		
	}
	public static void main(String[] ar) {
		int [] arr ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int [] arr2 = {0, 1, 0, 1, 1, 1};
		rearrangeZerosOnes(arr2);
	}

}
