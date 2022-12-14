package ePatterns;

import java.util.Scanner;

public class CDifferentSquarePatterns {

	Scanner s = new Scanner(System.in);
	/*
1111
2222
3333
4444
	 */
	public void squarePatten1() {

		int  n = s.nextInt();
		/*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	/*
4321
4321
4321
4321	 
	 
	 */
	public void squarePattern2() {
		int n = s.nextInt();
		/*
		int i=1;
		while(i<=n) {
			int j=1;
			int t = n;
			while(t>=j) {
				System.out.print(t);
				t--;
			}
			System.out.println();
			i++;
		}
		*/
		for(int i=1;i<=n;i++) {
			int t = n;
			for(int j=1;t>=j;t--) {
				System.out.print(t);
			}
			System.out.println();
		}
		System.out.println("==================");
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void main(String[] args) {
		CDifferentSquarePatterns obj = new CDifferentSquarePatterns();
//		obj.squarePatten1();
		obj.squarePattern2();
	}
}
