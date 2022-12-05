package dConditionalsAndLoops;

import java.util.Scanner;

public class DConditionalsAndOperators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a , b;
		
		a = s.nextInt();
		b = s.nextInt();
		if(a>0 && b>0) {
			System.out.println("both are positive");
		}else {
			System.out.println("either is negative");
		}
		
		int p = 50;
		int q = Integer.MIN_VALUE;
		if(p/0 == q) {
			System.out.println("Hi");
		}else {
			System.out.println("hello");
		}
	}
}
