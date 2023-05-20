
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"
				, "n", "o", "p", "q","r","s","t","u","v","w","x","y","z"};
		int numCases = scan.nextInt();
		while(numCases-- > 0) {
			String ans = "";
			int[] nab = new int[] {scan.nextInt(), scan.nextInt(), scan.nextInt()};
			int count = 0;
			int index = 0;
			for (int i = 0; i < nab[0]; i++) {
				if (count == nab[2]) {
					count = 0;
					index = 0;
				}
				
				ans += arr[index];
				index++;
				count++;
				
			}
			System.out.println(ans);
		}
		
	}
}