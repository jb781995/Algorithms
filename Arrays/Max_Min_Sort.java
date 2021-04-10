package Geeks.Arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
 * https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/
 */
public class Max_Min_Sort {
	//using auxiliary space
  public static void maxMinRearrange(int[] arr) {
	  int [] temp = new int[arr.length];
	  int min = 0, max = arr.length-1;
	  boolean flag = true;
	  for(int i=0;i<arr.length;i++) {
		  if(flag)
			  temp[i] = arr[max--];
		  else
			  temp[i] = arr[min++];
		  flag=!flag;
	  }
  }
  
  //O(1) extra space. The idea is to use multiplication and modular trick to store two elements at an index
  // geeksforgeeks.org/rearrange-array-maximum-minimum-form-set-2-o1-extra-space/
  public static void maxMinRearrange2(int[] arr) {
	  int minIndex = 0, maxIndex = arr.length-1;
	  int maxValue = arr[maxIndex] + 1;
	  for(int i=0;i<arr.length;i++) {
		  if(i%2==0) {
			  arr[i]+= (arr[maxIndex]%maxValue)*maxValue;
			  maxIndex--;
		  }
		  else {
			  arr[i]+=(arr[minIndex]%maxValue)*maxValue;
			  minIndex++;
		  }
	  }
	  
	  System.out.println(Arrays.toString(arr));
	  for(int i=0;i<arr.length;i++)
		  arr[i] = arr[i]/maxValue;
	  
	  System.out.println(Arrays.toString(arr));
  }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		maxMinRearrange2(arr);

	}

}
