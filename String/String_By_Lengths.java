package Geeks.String;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/sort-array-strings-according-string-lengths/
 */
public class String_By_Lengths {
//insertion sort
	public static void sort(String[] arr, int n) {
		for(int i=1;i<n;i++) {
			String temp = arr[i];
			//bcoz we always want to begin comparing with the String at previous location 
			int j = i-1;
			//and then keep on comparing all the way until we've reached index 0.
			while(j>=0 && temp.length()< arr[j].length()) {
				//the reason we have to insert at j+1 is bcoz we have set it to j=i-1
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println("\n\nResult: "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		String []arr = {"GeeksforGeeks", "am", "from", "I"}; 
		 // {am, geeksforgeeks,for,i}
		//  {am, geeksforgeeks, geeksforgeeks, i}-> "for" NLT "am", so-> {am, for,geeksforgeeks, i}
		// {am , for,geeksforgeeks , geeksforgeeks} -> {am,for , for, geeksforgeeks} -> {am, am, for, geeksforgeeks}->{i, am, for, geeksforgeeks}
		
	    int n = arr.length; 
	    sort(arr, n);
	}

}
