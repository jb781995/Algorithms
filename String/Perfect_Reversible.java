package Geeks.String;
/*
 * https://www.geeksforgeeks.org/perfect-reversible-string/
 */
public class Perfect_Reversible {

// a smart way is to check if the String is reversible i.e palindrome 	
public static boolean isReversible(String str) {
	int i=0, j=str.length()-1;
	//iterate from left and right
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j))
			return false;
		i++;
		j--;
	}
return true;	
}
	public static void main(String[] args) {
		String str = "aba";
		if(isReversible(str))
			System.out.println("perfectly reversible");
		else
			System.out.println("Not possible");

	}

}
