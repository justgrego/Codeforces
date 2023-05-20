import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int numCount = scan.nextInt();
		long count = 2;
		if (numCount == 1) {
			System.out.println(2);
		}
		else {
			for (int i = 2; i <= numCount; i++) {
				count += (long)Math.pow(2, i);
			}
			System.out.println(count);
		}
		
		
		
	
		
		
			
		
	
		
		
		
	
	}
}
