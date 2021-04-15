package Geeks.String;

import java.util.Stack;

/*
 * https://www.geeksforgeeks.org/program-reverse-string-iterative-recursive/
 */
public class String_Reverse_IterativeRecursive {
// approach-1: using stack
	public static String reverseWithStack(char[] str) {
		Stack<Character> st = new Stack();
		
		for(int i=0;i<str.length;i++)
			st.push(str[i]);
		
		for(int i=0;i<str.length;i++) {
			str[i] = st.peek();
			st.pop();
		}
		
		return new String(str);
	}
	
	// iterative with StringBuffer
	public static String reverseWithBuffer(String str) {
		int len = str.length();
		StringBuffer buffer= new StringBuffer();
		for(int i=len-1;i>=0;i--) 
		  buffer.append(str.charAt(i));	
		
		return new String(buffer);
	}
	
	public static void main(String[] args) {
		String str= "geeks";
		System.out.println("Reversed: "+reverseWithStack(str.toCharArray()));
		
		System.out.println();
		System.out.println("Reversed: "+reverseWithBuffer(str));
		

	}

}
