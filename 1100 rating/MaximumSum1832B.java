
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		long numCount = scan.nextInt();
		
		
		while(numCount-- > 0) {
			ArrayList<Long> arr = new ArrayList<>();
			long num = scan.nextInt();
			int k = scan.nextInt();
			for (int i = 0; i < num; i++) {
				arr.add(scan.nextLong());
				
			}
			Collections.sort(arr);
			int len = arr.size() - k;
	
			long sum = 0;
			for (int i = 0; i < len; i++) {
				sum+=arr.get(i);
			}
	
			
			long max = Math.max(0, sum);
			boolean div = false;
			int i = 1;
			while(len < arr.size()) {
			
				sum -= arr.get(i - 1);
				if (i % 2 == 0) {
					sum += arr.get(len);
					len++;
					max = Math.max(max, sum);
				}
				i++;
			}
			System.out.println(max);
			
		}
	
		
		
		
	
	}
}