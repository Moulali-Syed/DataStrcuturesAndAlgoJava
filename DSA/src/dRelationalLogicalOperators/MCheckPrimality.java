package dRelationalLogicalOperators;

import java.util.Scanner;

public class MCheckPrimality {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime = false;
				break;//will only break the loop
				//if we use return here no other statement in main will execute after this
			}
		}
		
		String res = isPrime ? "is a Prime Number" : "is a Composite Number";
		System.out.println(n+" "+res);
	}
}
