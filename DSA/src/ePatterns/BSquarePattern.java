package ePatterns;

import java.util.Scanner;

public class BSquarePattern {

	Scanner s = new Scanner(System.in);
	public void squarePattern1() {
		int n = s.nextInt();
		/*
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
***
***
***
		 */
	}
	
	public void squarePattern2() {
		int n = s.nextInt();
		/*
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 
		 */
	}
	public static void main(String[] args) {
		BSquarePattern obj  = new BSquarePattern();
		obj.squarePattern1();
//		obj.squarePattern2();
	}
}
