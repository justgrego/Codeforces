
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
		
		String s = scan.next();
	
		int mid = num/2;
		int firstsum = 0;
		int secSum = 0;
		boolean yes = false;
		for (int i = 0; i < num; i++ ) {
			if (i < mid) {
				firstsum += Integer.parseInt(String.valueOf(s.charAt(i)));
				
			}
			else {
				secSum += Integer.parseInt(String.valueOf(s.charAt(i)));
			}
			if (s.charAt(i) != '7' && s.charAt(i) != '4') {
				yes = false;
		
				break;
			}
			else {
			
				yes = true;
			}
		}

		if (yes && firstsum == secSum) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

 	
		
	}
}