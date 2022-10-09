package ePatterns;

import java.util.Scanner;

/*
Code : Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
 */
public class MInterestingAlphabetPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		for(int i=1;i<=n;i++) {
			int ch = 'A'+(n-i);
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}
	}
}
