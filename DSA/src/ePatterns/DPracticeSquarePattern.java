package ePatterns;

import java.util.Scanner;

/*
 Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
 */
public class DPracticeSquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		/*
		int i=1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print(n);
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
