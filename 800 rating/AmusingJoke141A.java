import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		String name3 = scan.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < name1.length(); i++) {
			if (map.containsKey(name1.charAt(i))) {
				map.put(name1.charAt(i), map.get(name1.charAt(i)) + 1);
			}
			else {
				map.put(name1.charAt(i), 1);
			}
		}
		for (int i = 0; i < name2.length(); i++) {
			if (map.containsKey(name2.charAt(i))) {
				map.put(name2.charAt(i), map.get(name2.charAt(i)) + 1);
			}
			else {
				map.put(name2.charAt(i), 1);
			}
		}
		boolean yes = false;
		for (int i = 0; i < name3.length(); i++) {
			if (map.containsKey(name3.charAt(i))) {
				map.put(name3.charAt(i), map.get(name3.charAt(i)) - 1);
				yes = true;
			}
			else {
				yes = false;
				break;
			}
		}
		if (yes) {
			for (Entry<Character, Integer> E : map.entrySet()) {
				if (E.getValue() != 0)  {
					yes=  false;
					break;
				}
				else {
					yes = true;
				}
			}
		}
		if(yes) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

 	
		
	}
}