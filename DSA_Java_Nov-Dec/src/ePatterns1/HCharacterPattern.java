package ePatterns1;

import java.util.Scanner;

/*
ABCD
ABCD
ABCD
ABCD
 */
public class HCharacterPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print((char)('A'+j-1));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
