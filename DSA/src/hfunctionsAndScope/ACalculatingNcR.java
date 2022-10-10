package hfunctionsAndScope;

import java.util.Scanner;

public class ACalculatingNcR {

	public static int factorial(int n ) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		/*
		 NcR = n!/(r!*(n-r)!)
		 */
		
		int nCr = factorial(n)/(factorial(r)*(factorial(n-r)));
		System.out.println(nCr);
	}
}
