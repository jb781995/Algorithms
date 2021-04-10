package BFS;

public class Divide_Without_Division {
public static int isDivisble(int dividend, int divisor) {
	int result = -1;
	int counter = 0;
	while(true) {
		if(result>dividend && result!=dividend){
			result=-1;
			return result;
		}
		else if(result==dividend)
			break;
		
	else {
		counter++;
		result = counter*divisor;
		
	}
	}
	return counter;
}
	public static void main(String[] args) {
		if(isDivisble(12, 4)==-1)
			System.out.println("cannot divide");
		else
			System.out.println("answer: "+isDivisble(12, 4));

	}

}
