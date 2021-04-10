package BFS;
/*
 * ["flower","flow","flight"]
 */
public class TestPrefix1 {

	public static String functionPrefix(String [] arr) {
		
		String res = "";
		
		int counter = 0;
		int charFirst =  arr[0].charAt(0);
		int maxLen = arr[0].length();
		int t= 0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i].length() > maxLen) {
				maxLen = arr[i].length();
			}
		}
		
		System.out.println("max len: "+maxLen);
		String matchingPref = "";
		outer:for(int j= 0;j<maxLen;j++) {
			for(int k = 1;k<arr.length;k++) {
				if(arr[0].charAt(j) != arr[k].charAt(j) ) 
			        break outer;
			}
			matchingPref+= Character.toString(arr[0].charAt(j));
			System.out.println(" matching till now: "+matchingPref);
		}
		
		System.out.println("matching prefix len: "+matchingPref);
		counter = matchingPref.length();
		if(counter<2)
			res = "no common prefix";
		else
			res = matchingPref;
		
		return res;
	}
	public static void main(String[] args) {
		 
		String [] arr= {"flower","flow","flight","flish"};
		System.out.println("result:---->  "+functionPrefix(arr));

	}

}
