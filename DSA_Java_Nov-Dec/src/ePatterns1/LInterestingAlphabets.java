package ePatterns1;

import java.util.Scanner;

/*
Code : Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */
public class LInterestingAlphabets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		char ch = (char)(65+n-1);
		int i = 1;
		while(i<=n) {
			int j = 1;
			int c = i;
			while(j<=i) {
				System.out.print((char)(ch-c+1));
				c--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}