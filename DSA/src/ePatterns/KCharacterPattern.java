package ePatterns;

import java.util.Scanner;

/*
ABCD
BCDE
CDEF
DEFG
 */
public class KCharacterPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ch;
		for(int i=1;i<=n;i++) {
			ch = i-1;
			for(int j=1;j<=n;j++) {
				System.out.print((char)(ch+'A'));
				ch++;
			}
			System.out.println();
		}
	}
}
