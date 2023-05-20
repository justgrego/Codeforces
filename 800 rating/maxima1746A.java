import java.util.*;




import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {

		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		
		while (numCases-- > 0) {
			int numArr = scan.nextInt();
			int[] arr = new int[numArr];
			int k = scan.nextInt();
			int ones = 0;
			int zeroes = 0;
			for (int i = 0; i < numArr; i++) {
			
				if (scan.nextInt() == 0) zeroes++;
				else ones++;
			}
			if (ones >= 1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		
				
		}
		
		
	}
}