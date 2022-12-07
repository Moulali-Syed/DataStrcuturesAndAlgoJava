package gFunctionsAndScope;

import java.util.Scanner;

public class BMoreOnFunctions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int sum = sum(a,b);
		System.out.println(sum);
		
		printEvenNums(100);
	}

	public static int sum(int a, int b) {

		return a+b;
	}
	
	public static void printEvenNums(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
