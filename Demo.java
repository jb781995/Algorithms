package BFS;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		
		int t = sc.nextInt();
		sc.nextLine(); // try removing this line and see how weird it behaves..
		for(int i = 0; i<t;i++) {
			String s = sc.nextLine();
			System.out.println("..** "+ s);
		}

	}

}
