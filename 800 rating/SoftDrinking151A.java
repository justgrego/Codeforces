
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
		int k = scan.nextInt();
		int l = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int p = scan.nextInt();
		int nl = scan.nextInt();
		int np = scan.nextInt();
		int mill = k * l;
		int nlDrink = (mill/nl) / n ;
		int limes = (c * d) / n;
		int salt = (p/np) / n;
		System.out.println(Math.min(salt, Math.min(nlDrink, limes)));
	
		
		
	}
		
}
