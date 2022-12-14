package fpatterns;

import java.util.Scanner;

/*
Code : Mirror Image Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234

6+1+0  = 7  spaces,numbers,spaces
4+2+1 = 7
2+3+2 = 7
0+4+3 = 7


rows = input , columns = input*2 -1

2n-1  = spaces + numbers + spaces
	=        +    i      + i-1

7     =  ?+1[i]+0[i-1]

(2n-1)-2i+1
2(n-i)

 */

public class CMirrorPatternPractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//number of cols - 7 = spaces+number+space
			//6 		1 i-1
			//4		    2 i-1
			//2			3 2
			//0			4 3
			int p = 1;
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print(p);
				p++;
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
