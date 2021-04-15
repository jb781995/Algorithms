package Geeks.String;
/*
 * https://www.geeksforgeeks.org/generate-rotations-given-string/
 */

public class All_Possible_String_Rotations {

	public static void allPossibleRotations(String str) {
		int n = str.length();
		StringBuffer buffer = new StringBuffer(str);
		//append string to itself
		buffer.append(str);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j!=n;j++)
				System.out.print(buffer.charAt(i+j));
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		//  original = geeks. string buffer = geeksgeeks. n=5
		// i=0, j=0 to 4 buffer.charAt(0+0),0+1,0+2,0+3,0+4--> geeks
		//i=1, j=0 to 4 buffer.charAt(1+0),1+1,1+2,1+3,1+4--> eeksg
		//i=2, j=0 to 4 buffer.charAt(2+0),2+1,2+2,2+3,2+4--> eksge
		//i=3, j=0 to 4 buffer.charAt(3+0),3+1,3+2,3+3,3+4--> ksgee and so on...
		
		String str = "Meera";
		allPossibleRotations(str);

	}

}
