package ePatterns;

import java.util.Scanner;
/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
 */
public class HPracticereverseTriangularPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		/*
		for(int i=1;i<=n;i++) {
			int p = i;
			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p--;
			}
			System.out.println();
		}
		*/
		
		int i = 1;
		while(i<=n) {
			int j=1;
			int p = i;
			while(j<=i) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
