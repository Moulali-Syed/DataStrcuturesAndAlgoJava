package fpatterns;

import java.util.Scanner;

/*

Code : Triangle of Numbers

Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1 		1-1
         232 		2-3
       34543 		3-5
     4567654 		4-7
   567898765
Sample Input 2:
4
Sample Output 2:
           1 - 6 1 , n=4
         232 - 4 3
       34543 - 2 5
     4567654 - 0 7
 */
public class HTriangleofNums {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//for given n = we have 2n-1 cols
		
		for(int i=1;i<=n;i++) {
			int p = i;
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			int x = 0;
			for(int j=1;j<=2*i - 1;j++) {
				if(p<2*i) {
					System.out.print(p);
					p++;
					x=p;
				}else {
					x--;
					System.out.print(x-1);
				}
			}
			System.out.println();
		}
	}
}
