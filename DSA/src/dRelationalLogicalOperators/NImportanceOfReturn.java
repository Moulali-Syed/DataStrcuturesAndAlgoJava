package dRelationalLogicalOperators;

import java.util.Scanner;

public class NImportanceOfReturn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
//				isPrime = false;
				System.out.println("Composite");
				return;
			}
		}
		
		System.out.println("prime");
		/*
		//all this code will be ignored, after return statement
		
		
		String res = isPrime ? "is a Prime Number" : "is a Composite Number";
		System.out.println(n+" "+res);
		
		*/
	}
}
