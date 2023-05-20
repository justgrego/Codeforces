
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
		long num = scan.nextLong();
		int count = 0;
		if (num <= 5 || num % 2 != 0) {
			System.out.println(0);
		}
		else {
			long start = 2;
			long end = num - start;
			while (start < end) {
				start+=2;
				end -=2;
				count++;
			}
			System.out.println(count);
		}
	
		
	}
}
