package ePatterns;

import java.util.Scanner;
/*
ABCD
ABCD
ABCD
ABCD
 */
public class ICharacterPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			int ch = 'A';
			for(int j=1;j<=n;j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}
		/*
		int p=1;
		while(p<=n) {
			int q=1;
			int ch1 = 'A';
			while(q<=n) {
				System.out.print((char)ch1);
				ch1++;
				q++;
			}
			System.out.println();
			p++;
		}
		*/
	}
}
//A-  65[ASCII]