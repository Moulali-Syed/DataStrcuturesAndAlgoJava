package ePatterns;

import java.util.Scanner;

/*
Code : Alpha Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 */
public class JCharacterPatternPractice2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			int ch = 'A'+i-1;
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch);
				
			}
			System.out.println();
		}
	}
}
