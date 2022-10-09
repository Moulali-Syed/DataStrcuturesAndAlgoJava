package ePatterns;

import java.util.Scanner;

/*
Code : Character Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
 */
public class LCharacterPatternPractice2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int ch = 'A'+i-1;
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}
	}
}
