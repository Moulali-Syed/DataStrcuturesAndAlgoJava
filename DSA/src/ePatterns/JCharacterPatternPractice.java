package ePatterns;

import java.util.Scanner;

/*
Code : Alpha Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 5
A
AB
ABC
ABCD
ABCDE
 */
public class JCharacterPatternPractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			char ch = 'A';
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}
	}
}
