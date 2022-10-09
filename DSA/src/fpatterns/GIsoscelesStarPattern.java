package fpatterns;

import java.util.Scanner;
/*
 Code : Star Pattern

Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
 */
public class GIsoscelesStarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		/*
		 if n=4 , totalCols = 2*n-1 = 7
		 row1 = 3 spaces  1 num 3 spaces
		 row2 =  2         3num  2
		 row3 = 1			5    1
		 row4 = 0  		7		0
		 */
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
