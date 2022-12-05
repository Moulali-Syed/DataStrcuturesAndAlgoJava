package ePatterns1;

import java.util.Scanner;

/*
 1111
 2222
 3333
 4444
 
 --------
 
 1234
 1234
 1234
 1234
 
 --------
 
 4321
 4321
 4321
 4321
 */
public class BNumberedSquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
//		System.out.println(n);
		System.out.println("*****************************************************");
		
		int p = 1;
		while(p<=n) {
			int q = 1;
			while(q<=n) {
				System.out.print(q);
				q++;
			}
			System.out.println();
			p++;
		}
		
		System.out.println("*****************************************************");

		int a = 1;
		while(a<=n) {
			int b = n;
			while(b>0) {
				System.out.print(b);
				b--;
			}
			a++;
			System.out.println();
		}
	}
}
