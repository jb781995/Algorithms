package Geeks.Arrays;
/*
 * https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/
 */
public class MinSwaps_For_LessThan_K {
  static int minSwaps(int [] arr, int n, int k) {
	  //find the count of elements less than or equals to k
	  int count =0;
	  for(int i=0;i<arr.length;i++)
		  if(arr[i]<=k)
			  ++count;
	  // find unwanted elements in current window of size 'count'
	  int bad =0;
	  for(int i=0;i<count;i++)
		  if(arr[i]>k)
			  ++bad;
	  //initialize answer with bad value of current window
	  int ans = bad;
	  System.out.println("bad: "+bad+", count: "+count);
	  for(int i=0, j=count;j<n;++i,++j) {
		  
	  // shrink the window if
		  if(arr[i]>k)
			  --bad;
	  // increment the window if
		  if(arr[j]>k)
			  ++bad;
		  
	  //update ans if count of 'bad' is less in this window
	  ans = Math.min(ans, bad);
	  System.out.println("        "+ans);
	  }
	  
	  return ans;
  }
	public static void main(String[] args) {
		int arr1[] = {2, 7, 9, 5, 8, 7, 4}; 
		//  int arr[] = {2, 1, 5, 6, 3};
		System.out.println(minSwaps(arr1, arr1.length, 7));

	}

}
