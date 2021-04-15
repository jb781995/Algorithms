package Geeks.String;
/*
 * https://www.geeksforgeeks.org/print-words-string-reverse-order/
 */
public class Sentence_Reverse {
	//  input: I Am A Geek
	//  output: Geek A Am I
  public static void reverseSentence(String s) {
	  char [] chars =  s.toCharArray();
	  int n = chars.length-1;
	  String str = new String();
	  int i=n;
	  while(n>=0) {
		  if(s.charAt(n)==' ') {
			 str+=s.substring(n, i+1); 
			 i=n;
		  }
		  n--;
	  }
	  System.out.println("result: "+str);
  }
  
  
	public static void main(String[] args) {
	  String s = "i am a geek sort of a guy";
	  reverseSentence(s);
	}

}
