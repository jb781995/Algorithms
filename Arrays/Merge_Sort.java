package Geeks.Arrays;

import java.util.Arrays;

public class Merge_Sort {
	public static void merge(int [] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			merge(arr, l, m);
			merge(arr, m+1, r);
			sort(arr, l, m, r);
		}
	}
	public static void sort(int [] arr, int l, int m, int r) {
		int l1 = m-l+1;
		int l2 = r-m;
		System.out.println("l: "+l+", m: "+m+", r: "+r+", l1: "+l1+", l2: "+l2);
		int [] a1 = new int[l1];
		int [] a2 = new int[l2];
		
		for(int i=0;i<l1;i++)
			a1[i] = arr[i];
		
		for(int i=l1, j=0;i<l1+1;i++, j++)
			a2[j] = arr[i];
		
		System.out.println("two halves:\n"+Arrays.toString(a1)+"\n"+Arrays.toString(a2));
		
		int left=0, right=0, k=0;
		while(left<l1 && right<l2) {
			if(a1[left]<a2[right]) {
				arr[k] = a1[left];
				left++;
			}
			else {
				arr[k] = a2[right];
				right++;
			}
			k++;
		}
		System.out.println("status of left: "+left+", right: "+right);
		
			while(left<l1) {
				arr[k] = a1[left];
				left++;
				k++;
			}
		
	
			while(right<l2) {
				arr[k] = a1[right];
				right++;
				k++;
			}
		System.out.println("\nsorted array so far: "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr [] = {3,2,1};
		int l=0;
		int r = arr.length-1;
		int m = (l+r)/2;
		//sort(arr, l, m, r);
		merge(arr, l, r);

	}

}
