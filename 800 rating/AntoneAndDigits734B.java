import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		int two = Integer.parseInt(s[0]);
		int three = Integer.parseInt(s[1]);
		int five = Integer.parseInt(s[2]);
		int six = Integer.parseInt(s[3]);
		int ans = 0;
		//if 2 || 5 || 6 == 0 stop
		//then if 3 == 0 stop
		while(two > 0 && five > 0 && six > 0) {
			ans += 256;
			two--;
			five--;
			six--;

		}
		int max = 0;
		if (three > 0 && two > 0) {
			max = Math.min(three, two);
			ans += max * 32;
		}
		System.out.println(ans);
	
	}
}