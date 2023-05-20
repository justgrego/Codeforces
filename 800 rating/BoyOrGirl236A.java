import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();
		String name = scan.nextLine();
		for (int i = 0; i < name.length(); i++) {
			set.add(name.charAt(i));
		}
		if(set.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	
	}
}