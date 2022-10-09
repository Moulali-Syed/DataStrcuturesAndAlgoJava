package ePatterns;

import java.util.Scanner;

/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
 */
public class FPracticeTriangularPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		/*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
