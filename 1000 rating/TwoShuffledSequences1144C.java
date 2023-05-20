import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int numCount = scan.nextInt();
		int[] arr = new int[numCount];
		//if 2 || 5 || 6 == 0 stop
		//then if 3 == 0 stop
		HashSet<Integer> inc = new HashSet<>();
		HashSet<Integer> dec = new HashSet<>();
		boolean poss = true;
		for (int i =0; i < numCount; i++) {
			arr[i] = scan.nextInt();
			if (inc.contains(arr[i]) && dec.contains(arr[i])) {
				poss = false;
				break;
			}
			else if (inc.contains(arr[i])) {
				dec.add(arr[i]);
			}
			
			else {
				inc.add(arr[i]);
			}
		}
		TreeSet<Integer> in = new TreeSet<>(inc);
		TreeSet<Integer> der = new TreeSet<>(dec);
		TreeSet<Integer> de = (TreeSet<Integer>)der.descendingSet();
		
	
		
		if (!poss) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
			System.out.println(in.size());
			int count = 0;
			for (Integer e : in) {
				System.out.print(e);
				if (count < in.size() - 1) {
					System.out.print(" ");
				}
			}
			count = 0;
		   
			System.out.println();
			System.out.println(de.size());
			
			for (Integer e : de) {
				System.out.print(e);
				if (count < de.size() - 1) {
					System.out.print(" ");
				}
			}
		
		}
		
		
	
	}
}