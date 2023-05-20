import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double num = scan.nextDouble();
		double tot = 0.0;
		for (int i = 0; i < num; i++) {
			double frac = scan.nextDouble() / 100;
			tot += frac;
		}
		System.out.println((tot/num) * 100.0);
	
	}
}