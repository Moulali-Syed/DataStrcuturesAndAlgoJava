package ePatterns;

import java.util.Scanner;

public class ETriangularPattern {

	Scanner s = new Scanner(System.in);
	/*
1
12
123
1234
	 */
	public void triangularPattern1() {
		int n = s.nextInt();
		/*
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/*
1
23
456
78910
	 */
	public void triangularPattern2() {
		int n = s.nextInt();
		/*
		int num = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		*/
		
		int i = 1;
		int num = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(num);
				j++;
				num++;
			}
			System.out.println();
			i++;
		}
	}

	/*
1
23
345
4567
	 */
	public void triangularPattern3() {
		
		int n = s.nextInt();
		/*
		for(int i=1;i<=n;i++) {
			int num = i;
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		*/
		int i=1;
		while(i<=n) {
			int j=1;
			int num = i;
			while(j<=i) {
				System.out.print(num);
				num++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	public static void main(String[] args) {
		ETriangularPattern obj = new ETriangularPattern();
//		obj.triangularPattern1();
//		obj.triangularPattern2();
		obj.triangularPattern3();
	}
	
}
