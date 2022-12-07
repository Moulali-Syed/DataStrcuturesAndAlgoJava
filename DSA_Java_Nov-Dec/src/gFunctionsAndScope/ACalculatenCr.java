package gFunctionsAndScope;

import java.util.Scanner;

public class ACalculatenCr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//nCr
		int r = s.nextInt();
		
		int res = calculatenCr(n,r);
		System.out.println(res);
	}

	public static int calculatenCr(int n,int r) {

		int nFact = factorial(n);
		int rFact = factorial(r);
		int nrFact = factorial(n-r);
		
		int res = nFact/(rFact*nrFact);
		return res;
	}

	public static int factorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
}

/*
To avoid repetition we can use - functions
helps increase readability and Testability
*/