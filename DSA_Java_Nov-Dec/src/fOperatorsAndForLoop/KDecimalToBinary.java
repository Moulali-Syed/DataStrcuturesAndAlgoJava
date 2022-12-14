package fOperatorsAndForLoop;

import java.util.Scanner;
/*
Decimal to Binary

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number
 can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12  -  

	2|12 |
	2| 6 |0
	2| 3 |0
	2| 1 |1
	2| 0 |1
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
 */
public class KDecimalToBinary {

	public static int rev(String n) {
		String s = "";
		for(int i=n.length()-1;i>=0;i--) {
			s+=n.charAt(i);
		}
		int num = Integer.parseInt(s);
		return num;
	}
	
	public static void main(String[] args) {
		Scanner s  =  new Scanner(System.in);
		int n = s.nextInt();
		String num = "";
		while(n>0) {
			int rem = n%2;
			num+=rem;
			n = n/2;
		}
		
		int reqBinary = rev(num);
		System.out.println(reqBinary);
		
	}
}
