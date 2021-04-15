package Geeks.String;
/*
 * https://www.geeksforgeeks.org/finite-automata-algorithm-for-pattern-searching/
 */
public class Finite_Automata {
	//this doesn't work completely. wrong.
public static void finiteAutomata( char [] pat, char[] txt) {
	int n = pat.length-1;
	int m = txt.length-1;
	String pattern = "";
	for(int k=0;k<=n;k++)
		pattern+=pat[k];
	System.out.println("have to compare: "+pattern);
	
	String str="";
	for(int i=0;i<=m;i++) {
		if(i>0 && i%n==0) {
			str+=txt[i];
			//System.out.println("    string formed at "+i+"="+str);
			if(str.equals(pattern))
				System.out.println("pattern matched at: "+i);
			str="";
			str+=txt[i];
		}
		else {
			str+=txt[i];
			//System.out.println("string: "+str+" and "+i+"%"+n+"!=0");
		}
	}
}

public static void finiteAutomata2(char[] pat, char[] txt) {
	
}
	public static void main(String[] args) {
      char[] txt = "AABAACAADAABAAABAA".toCharArray(); 	
      char [] pat = "AABA".toCharArray();
      
      finiteAutomata(pat, txt);

	}

}
