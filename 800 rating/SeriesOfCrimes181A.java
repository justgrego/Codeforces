
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
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[n];
		int count = 0;
		HashMap<Integer, String> map = new HashMap<>();
		int ansInd = 0;
		
		int colindex = 0;
		while (n-- > 0) { 
			String line = scan.nextLine();
		
			Integer stars = (int) line.chars().filter(ch -> ch == '*').count();
			map.put(count, line);
			if (stars == 1) {
				ansInd = count;
			}
			if (stars == 2) {
				colindex = count;
			}
			arr[count++ ] = line;
			
		}
		int col1= -1 ;
		for (int i = 0; i < map.get(colindex).length(); i++) {
			if (map.get(colindex).charAt(i) == '*' && map.get(ansInd).charAt(i) != '*') {
				col1 = i;
			}
		}
		System.out.println(++ansInd + " " + ++col1);
	}
		
}