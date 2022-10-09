package fpatterns;

import java.util.Scanner;
/*
   1
  121
 12321
1234321  
 */
public class FIsocelesTrianglePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//for n= 4 , noOfCols = 7
		//row1 - 3space 1num 3space
		//row2 - 2space 3num 2space
		//row3 - 1space 5num 1space
		//row4 - 0space 7num 0space
		
		for(int i=1;i<=n;i++) {
			int p = i-1;
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=i-1;j++) {
				
				System.out.print(p);
				p--;
			}
			System.out.println();
		}
		
	}
}
