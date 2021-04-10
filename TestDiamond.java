package BFS;

public class TestDiamond {
	
	public static String [] functionDiamond(String input) {
		String [] result = new String [input.length()];
		int len = input.length();
		len = (len*2) - 1;
		int fr_space = input.length()-1;
		int mid_space = 1;
		
		for(int i =0;i<input.length();i++) {
			String s = " ";
			int t = fr_space;
			while(t>0) {
				s+="*";
				t--;
			}
			if(mid_space==1) {
			s+=input.charAt(i);
			
			}else {
				s+=input.charAt(i);
				int t2 = 0;
				while(t2<mid_space) {
					s+="*";
					t2++;
				}
				s+=input.charAt(i);
			}
			result[i] = s;
			System.out.println(s);
			fr_space--;
			mid_space++;
			
		}
		
		fr_space++;
		mid_space--;
		
		for(int i = input.length()-1;i>=0;i--) {
			String s = " ";
			int t = fr_space;
			while(t>0) {
				s+="*";
				t--;
			}
			if(mid_space==1) {
			s+=input.charAt(i);
			
			}else {
				s+=input.charAt(i);
				int t2 = 0;
				while(t2<mid_space) {
					s+="*";
					t2++;
				}
				s+=input.charAt(i);
			}
			result[i] = s;
			System.out.println(s);
			fr_space++;
			mid_space--;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
  
		 String input = "abcd";
		 functionDiamond(input);

	}

}
