package gOperatorsAndForloops;

import java.util.Scanner;

/*
Decimal to Binary

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, 
so the corresponding binary number can exceed the integer range.
 So you may want to take the answer as long for CPP and Java.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
 */
public class RDecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String res="";
		while(n>0) {
			int num = n/2; 
			int rem = n%2;
			System.out.print(rem);
			res +=rem;
			n=num;
		}
		System.out.println();
		System.out.print("Binary Number is ");
		for(int i=res.length()-1;i>=0;i--) {
			System.out.print(res.charAt(i));
		}
		
	}
}
/*

	2 12
	2 6 0
	2 3 0
	2 1 1
	2 0 1
 */
