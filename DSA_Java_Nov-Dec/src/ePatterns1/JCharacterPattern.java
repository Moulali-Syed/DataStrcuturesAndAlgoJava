package ePatterns1;

import java.util.Scanner;

/*
ABCD
BCDE
CDEF
DEFG
 */
public class JCharacterPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i = 1;
		int c ;
		while(i<=n) {
			int j = 1;
			c = i;
			while(j<=n) {
				System.out.print((char)(65+c-1));
				c++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
