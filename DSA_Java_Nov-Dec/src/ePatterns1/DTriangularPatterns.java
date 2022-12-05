package ePatterns1;

import java.util.Scanner;

/*

1
12
123
1234


==========

1
23
456
78910

=========
1
23
345
4567
 */
public class DTriangularPatterns {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
		
		System.out.println("*******************************************");
		
		int p =1;
		int r = 1;
		while(p<=n) {
			int q = 1;
			while(q<=p) {
				System.out.print(r);
				r++;
				q++;
			}
			System.out.println();
			p++;
		}
		
		System.out.println("*******************************************");

		int a = 1;
		int c ;
		while(a<=n) {
			int b = 1;
			c = a;
			while(b<=a) {
				System.out.print(c);
				c++;
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
