package Geeks.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * this was asked in an interview
 * input: arr = {1,4,2,3,5,6,7,0}
 * output: arr = {0,2,4,6,1,3,5}
 * first half should be sorted integer and second half should be sorted odds
 */
public class Even_Odd_Sort {
public static void sorting(int[] arr) {
	int n = arr.length;
	int [] arr2 =  new int[arr.length];
	int even=0;
	for(int i=0;i<n;i++)
		if(arr[i]%2==0)
			arr2[even++] = arr[i];
	
	int odd= even;
	
	for(int i=0;i<n;i++)
		if(arr[i]%2!=0)
			arr2[odd++] = arr[i];
	
	sortingInternal(arr2, 0, even);
	sortingInternal(arr2, even+1, odd);
	System.out.println(Arrays.toString(arr2));

}

// insertion sort
public static void sortingInternal(int [] arr, int beginIndex, int endIndex) {
	for(int i=beginIndex+1;i<endIndex;i++) {
		int temp = arr[i];
		int j = i-1;
		while(j>=beginIndex && temp<arr[j]) {
			arr[j+1] = arr[j];
			j--;
		}
		j++;
		arr[j] = temp;
	}
	
}

// Method-2  using libraries and making life a bit easier with Collections.sort
public static void sorting2(int [] arr) {
	ArrayList<Integer> even = new ArrayList<Integer>();
	ArrayList<Integer> odd = new ArrayList<Integer>();
	int n= arr.length;
	for(int i=0;i<n;i++)
		if(arr[i]%2==0)
			even.add(arr[i]);
	
	for(int i=0;i<n;i++)
		if(arr[i]%2!=0)
			odd.add(arr[i]);
	
	Collections.sort(even);
	Collections.sort(odd);
	int e = even.size();
	int o = odd.size();
	int [] result = new int [e+o];
	int i= 0;
	for(i=0;i<even.size();i++)
		result[i] = even.get(i);
	
	for(int j=0;j<odd.size();j++)
		result[i++] = odd.get(j);
	
	System.out.println("\n\n\n"+Arrays.toString(result));
	
}
	public static void main(String[] args) {
		int [] arr={1,4,2,3,5,6,7,0};
		sorting(arr);
        sorting2(arr);
	}

}
