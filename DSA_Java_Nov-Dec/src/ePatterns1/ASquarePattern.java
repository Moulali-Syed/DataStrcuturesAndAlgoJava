package ePatterns1;

import java.util.Scanner;

public class ASquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		/*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		int i=1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
