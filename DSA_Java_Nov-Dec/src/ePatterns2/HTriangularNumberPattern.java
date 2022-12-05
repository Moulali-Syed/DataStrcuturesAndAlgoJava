package ePatterns2;
//--------------------Solve Again -------------------------//
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
           1			 1, 8  [2i-1-numbers , 2n-2i - spaces]
         232			 3 ,6
       34543			 5 ,4
     4567654   -  2n-1 = 7 ,2
   567898765   -  2n-1 = 9
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
 */
public class HTriangularNumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
//				int valueToPrint = i;
//				while(j<=i) {
//					System.out.print(valueToPrint);
//					j+=1;
//				}
//				while(j<=i-1) {
//					System.out.print(valueToPrint);
//					valueToPrint-=1;
//					j+=1;
//				}
				int valueToprint = j>i ? j : i;
				System.out.print(valueToprint);
			}
			System.out.println();
		}
	}
}
