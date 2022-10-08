package dRelationalLogicalOperators;

import java.util.Scanner;
/*
 Multiplication Table

Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
Constraints :
0 <= n <= 10,000
Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20
 */
public class RMultiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+" = "+n*i);
		}
	}
}
