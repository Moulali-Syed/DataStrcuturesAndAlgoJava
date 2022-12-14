package gOperatorsAndForloops;

import java.util.Scanner;

/*
Nth Fibonacci Number

Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
Integer n
Output Format :
Nth Fibonacci term i.e. F(n)
Constraints:
1 <= n <= 25
Sample Input 1:
4
Sample Output 2:
3 
Sample Input 1:
6
Sample Output 2:
8
 */
public class IFindNthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for(int i=1;i<n;i++) {
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println(num3);
	}
}
