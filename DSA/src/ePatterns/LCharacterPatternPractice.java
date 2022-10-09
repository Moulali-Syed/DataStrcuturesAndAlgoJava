package ePatterns;

import java.util.Scanner;

/*
Code : Character Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
DEF
GHIJ
 */
public class LCharacterPatternPractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int ch = 'A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}
	}
}
