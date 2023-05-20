
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
		int n = scan.nextInt() - 1;
		int first = scan.nextInt();
		int max = first;
		int min = first;
		int count = 0;
		while (n-- > 0) {
			int curr = scan.nextInt();
			if (curr > max) {
				max = curr;
				count++;
			}
			else if (curr < min) {
				min = curr;
				count++;
			}
			
		}
		System.out.println(count);
	
		
		
	}
		
}