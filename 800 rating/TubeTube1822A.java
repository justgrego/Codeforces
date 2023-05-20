import java.util.*;




import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {

		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();
		
		
		while (numCases-- > 0) {
			
			int n = scan.nextInt();
			int t = scan.nextInt();
			int[] time = new int[n];
			int[] ent = new int[n];
			
			
			for (int i = 0; i < n; i++) {
				time[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				ent[i] = scan.nextInt();
			}
			
			int i = 0;
			int max = 0;
			int index = -1;
			
			while (i < n && t >= 1) {
				if (t - time[i] >= 0) {
					if (ent[i] > max ) {
						max = ent[i];
						index = i;
					}
				}
				i++;
				t-=1;
			}
			if (index == -1) {
				System.out.println(-1);
			}
			else {
				System.out.println(index + 1);
			}
			
			
			
		}
		
		
	}
}