
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ans = 0;
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		String[] arr = scan.nextLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			set.add(Integer.parseInt(arr[i]));
		}
		System.out.println(4 - set.size());
	}
}