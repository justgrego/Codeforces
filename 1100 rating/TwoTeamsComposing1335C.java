
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
		long numCases = scan.nextInt();
		while(numCases-- >0) {
			int num = scan.nextInt();
			HashMap<Integer, Integer> map = new HashMap<>();
			int maxSingle = 1;
			int maxHash = 0;
			for (int i = 0; i < num; i++) {
				int curr = scan.nextInt();
				if (map.containsKey(curr)) {
					map.put(curr, map.get(curr) + 1);
					if (maxSingle < map.get(curr)) {
						maxSingle = Math.max(maxSingle, map.get(curr));
						maxHash = curr;
					}
				}
				else {
					map.put(curr, 1);
				}
			}
			if (maxSingle == map.size()) {
				System.out.println(Math.min(maxSingle, map.size() - 1));
			}
			else {
				System.out.println(Math.min(maxSingle, map.size()));
			}
	
		}
	
		
	}
}