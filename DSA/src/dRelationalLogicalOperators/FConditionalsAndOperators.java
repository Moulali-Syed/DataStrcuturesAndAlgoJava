package dRelationalLogicalOperators;

import java.util.Scanner;

public class FConditionalsAndOperators {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>0 && b>0) {
			System.out.println("both are positive");
		}else {
			System.out.println("both are not positive");
		}
		
		if(a>0 || b>0) {
			System.out.println("one is positive");
		}else {
			System.out.println("none is positive");
		}
		
		//check equal or not
		if(a==b) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		if(a!=b) {
			System.out.println("not equal");
		}else {
			System.out.println("equal");
		}
		
	}

}
