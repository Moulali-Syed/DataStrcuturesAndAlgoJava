package aflowCharts1;

import java.util.Scanner;

public class RPrintFibonacciSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		int c;
		for(int i=2;i<=n-1;i++) {
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}
}
/*


All fibonacci numbers

You are given a single non-negative integer, N. You need to print all numbers that:
(i) occur in the range 0 to N (both inclusive)
(ii) are a part of the fibonacci sequence
Draw a flowchart for this process
Note 1: The first two terms of the fibonacci sequence are 0 and 1.
Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.


*/