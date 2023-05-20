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
		int num = scan.nextInt();
		int temp = num;
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		int max = 0;
		int min = Integer.MAX_VALUE;
		int count = 0;
		int firstMax = 0;
		while(temp-- > 0) {
			int curr = scan.nextInt();

			if (map.containsKey(curr)) {
				if (curr <= min) {
					
					min = curr;
					ArrayList<Integer> t = map.get(curr);
					t.add(count);
					map.put(curr, t);
				}
				if (curr >= max) {
					
				
				}
				
			}
			else {
				min = Math.min(min, curr);
				max = Math.max(max, curr);
				ArrayList<Integer> t = new ArrayList<>();
				t.add(count);
				map.put(curr, t);
				
			}
			count++;
			
		}
		Collections.sort(map.get(min), Collections.reverseOrder());
		int minIndex = map.get(min).get(0);
		Collections.sort(map.get(max));
		int maxIndex = map.get(max).get(0);
		if (minIndex < maxIndex) {
			System.out.println(maxIndex + (num - minIndex - 2));
		}
		else {
			System.out.println(maxIndex + (num - minIndex - 1));
		}
		

 	
		
	}
}
