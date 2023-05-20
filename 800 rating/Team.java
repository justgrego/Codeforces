
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCases = scan.nextInt();
		int ans = 0;
		while(nCases-- > 0) {
			int count = 0;
			for (int i = 0; i < 3; i++) {
				if (scan.nextInt() == 1) {
					count++;
				}
				
			}
			if (count >= 2) ans++;
		}
		System.out.println(ans);
	}
}
