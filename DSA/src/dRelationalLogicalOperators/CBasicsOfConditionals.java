package dRelationalLogicalOperators;

import java.util.Scanner;

public class CBasicsOfConditionals {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		if(n1>n2) {
			System.out.println("n1 is big number");
		}else {
			System.out.println("n2 is big number");
		}
		
		System.out.println("outside of if else");
	}
}
