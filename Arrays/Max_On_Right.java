package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/replace-every-element-with-the-greatest-on-right-side/
 * trick: start from the right most side of the array and start replacing each element with the max element till now
 * as we move from right to left
 */
public class Max_On_Right {
  public static void greaterOnRightSide(int [] arr) {
	  int max = arr[arr.length-1];
	  for(int i=arr.length-1;i>=0;i--) 
		  if(arr[i]<max)
			  arr[i] = max;
		  else
			  max = arr[i];
	  System.out.println(Arrays.toString(arr));
  }
	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2}; 
		greaterOnRightSide(arr);
	}

}
