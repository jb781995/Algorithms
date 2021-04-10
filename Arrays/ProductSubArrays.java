package Geeks.Arrays;

public class ProductSubArrays {

	public static void product_subarrays(int arr[], int n) 
    { 
        // Variable to store the product 
        int res = 1; 
  
        // Compute the product while 
        // traversing for subarrays 
        for (int i = 0; i < n; i++) { 
            int product = 1; 
            for (int j = i; j < n; j++) { 
                product = product * arr[j]; 
                res *= product; 
                System.out.println("product: "+product+", res: "+res);
            } 
        } 
  
        // Printing product of all subarray 
        System.out.println(res + "\n"); 
    } 
	public static void main(String[] args) {
		int [] arr = {10, 3,7};
		int n= arr.length;
		product_subarrays(arr, n);

	}

}
