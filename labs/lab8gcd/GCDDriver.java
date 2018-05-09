package lab8Pack;

import java.util.Scanner;

public class GCDDriver {

	public static void main(String[] args) {
		RationalNumber r = new RationalNumber();
		//System.out.println(r);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int n1 = scan.nextInt();
		System.out.println("Please enter the second number: ");
		int n2 = scan.nextInt();
		//System.out.println(r);
		System.out.println("Their greatest common divisor is " + r.gcd(n1, n2));
		//System.out.println("Their greatest common divisor is " + r.gcd2(n1, n2));
		scan.close();
	}

}
