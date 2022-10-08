package dRelationalLogicalOperators;

import java.util.Scanner;

public class DEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.print(num+" is even");
		}else {
			System.out.print(num+ " is odd");
		}
		System.out.println(" number");
	}
}
