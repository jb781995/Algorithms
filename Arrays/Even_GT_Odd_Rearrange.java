package Geeks.Arrays;
import java.util.Arrays;
/*
 *  https://www.geeksforgeeks.org/rearrange-array-such-that-even-positioned-are-greater-than-odd/?ref=lbp
 *  https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/?ref=lbp
 */
public class Even_GT_Odd_Rearrange {
  public static void rearrange(int [] arr, int n) {
	  int [] result = new int[n];
	  Arrays.sort(arr);
	  // now when we have sorted, we know that 0th index would be the least
	  // and last index would've the max value
	  int p=0;
	  int q=n-1;
	  
	  //also the way we are checking for (i+1) because when we will see the final output
	  // we will consider 0th as 1st index i.e index will start with 1,2.. so on. instead of 
	  // conventional indices 0,1,2...
	  for(int i=0;i<n;i++) {
		  if((i+1)%2==0)
			  result[i] = arr[q--];
		  else
			  result[i] = arr[p++];
	  }
	  
	  System.out.println(Arrays.toString(result));
  }
	public static void main(String[] args) {
		int [] arr= {5, 8, 1, 4, 2, 9, 3, 7, 6};
		int a = 2;
		int p = arr[a++];
		System.out.println(p);
		p = arr[a];
		System.out.println(p);
		
		rearrange(arr, arr.length);
		/*
		 * this problem is similar to the: Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
		 */

	}

}
