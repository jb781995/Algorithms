package Geeks.Arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
 */
public class ShuffleArray {
  public static void shuffleArray(int[] arr) {
	  int [] temp = arr;
	  Random r = new Random();
	// Start from the last element and swap one by one. We don't 
    // need to run for the first element that's why i > 0 
	  for(int n=arr.length-1;n>0;n--) {
		  // pick a random index from 0 to i
		  int j = r.nextInt(n+1);
		  //swap arr[n] with element at the random index j
		  int t = arr[n];
		  arr[n] = arr[j];
		  arr[j] = t;
	  }
	  System.out.println(Arrays.toString(arr));
  }
	public static void main(String[] args) {
		

	}

}
