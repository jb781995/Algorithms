package BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Monk_on_island {

	public static int method1(String[] roads, int max) {
		int[] cityRoads = new int[roads.length*2];
		int[][] cityRoads2 = new int[roads.length][2];
		ArrayList<Integer> shortestPaths = new ArrayList<Integer>();
		for(int i=0;i<roads.length;i++) {
			cityRoads2[i][0] = Integer.parseInt(roads[i].substring(0, 1));
			cityRoads2[i][1] = Integer.parseInt(roads[i].substring(2, roads[i].length()));
		}
		
		for(int i=0;i<cityRoads2.length;i++) {
			int steps = 0;
			if(cityRoads2[i][0]==max || cityRoads2[i][1]==max) {
				int min = 0;
				steps++;
				if(cityRoads2[i][0] < cityRoads2[i][1])
					min = cityRoads2[i][0];
				else
					min = cityRoads2[i][1];
				System.out.println("min: "+min);
				for(int j=i;j>=0;j--) {
					if(cityRoads2[j][0] <  min || cityRoads2[j][1] < min) {
						steps++;
					}
				}
				//steps = method2(cityRoads2, i, min, steps);
				shortestPaths.add(steps);
			}
		}
		Collections.sort(shortestPaths);
		return shortestPaths.get(0);
	}
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in); 
		  int t = sc.nextInt();
		  sc.nextLine(); // try removing this line and see how weird it behaves..
		  for(int i=0;i<t;i++) { 
			 String s = sc.nextLine();
			 int bridges = Integer.parseInt(s.substring(2, s.length()));
			 int lands = Integer.parseInt(s.substring(0, 1));
			 System.out.println("bridges "+bridges+" lands "+lands);
			 String roads[] = new String[bridges];
			  for(int j= 0;j<bridges;j++) { 
				  String cityRoad = sc.nextLine(); 
				  roads[j] = cityRoad; 
				  }
		  System.out.println("shortest path here: "+method1(roads, lands)); 
		  }
	}

}
