import java.util.*;




import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {

		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		while (numCases-- > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int bx1 = scan.nextInt();
			int by1 = scan.nextInt();
			int dist = scan.nextInt();
			if((by1-dist <=1 || bx1+dist>=n) && (by1+dist>=m || bx1 - dist<=1)){
				System.out.println(-1);
			}
			else {
				System.out.println(n+m - 2);
			}
				
			}
		
		
	}
}