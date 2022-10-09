package fpatterns;

import java.util.Scanner;
/*
Code : Inverted Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
 */
public class EInvertedNumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int p = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(p);
			}
			System.out.println();
			p--;
		}
	}
}
