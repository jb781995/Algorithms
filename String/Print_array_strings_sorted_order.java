package Geeks.String;
/*
 * https://www.geeksforgeeks.org/print-array-strings-sorted-order-without-copying-one-string-another/
 * Input : {"geeks", "for", "geeks", "quiz")
Output : for geeks geeks quiz

Input : {"ball", "pen", "apple", "kite"}
Output : apple ball kite pen
 */
public class Print_array_strings_sorted_order {
public static void printSortedOrder(String[] arr, int n) {
	int [] index= new int[n];
	for(int i=0;i<n;i++)
		index[i] = i;
	
	int i,j,min;
	//selection sort is applied here. See how differently selection sort works than insertion sort. where Insertion sort works its way in reverse order
	//until 0th index, selection progresses in positive direction. Comparison is started from element at one position behind and all the way to 0th index
	//in insertion, where it starts with element at one position ahead and moved all the way till end in selection sort.
	for(i=0;i<n;i++) {
		min = i;
		//with the help of 'index[]' strings are compared
		for(j=i+1;j<n;j++) 
			if(arr[index[min]].compareTo(arr[index[j]])>0)
				min = j;
	  
		//after all comparisons with the current index+1 till the end, we would've found a min for this iteration
		if(min!=i) {
			int temp = index[min];
			System.out.println("i: "+i+", index["+i+"]: "+index[i]);
			index[min] = index[i];
			index[i] = temp;
		}
	
	}
				
	// printing strings in sorted order 
    for (i = 0; i < n; i++) { 
        System.out.print(arr[index[i]] + " "); 
    } 
		
		
}
	public static void main(String[] args) {
		String s = "Bharadwaj";
		String s2 = "Meera";
		System.out.println(s.compareTo(s2));
		//only the first character ASCII codes are compared. B=66, M=77. B-M=66-77=-11 and that's the result
		
		String [] arr= {"ball", "pen", "apple", "kite"};
		int n = arr.length;
		printSortedOrder(arr, n);
	}

}
