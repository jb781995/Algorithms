package Geeks.String;
/*
 * https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
 */

public class String_Reverse_Words {
	public static void reverseUtil(char[] sentence, int start, int end) {
		
	}
 public static char[] reverseWords(char[] sentence) {
	 int start = 0;
	 for(int i=0;i<sentence.length;i++) 
		 if(sentence[i]==' ') {
			 reverseUtil(sentence, start, i);
			 start=i+1;
		 }
	 
	 //reverse the last word
	 reverseUtil(sentence, start, sentence.length-1);
			 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
