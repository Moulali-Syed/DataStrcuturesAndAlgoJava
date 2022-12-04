package aflowCharts1;

import java.util.Scanner;

/*
Member of Fibonacci

You are given a single non-negative integer, N. You need to find out whether N is a part of the fibonacci sequence.
Print "Yes" if it is and "No" if it's not.
Draw a flowchart for this process
Note 1: The first two terms of the fibonacci sequence are 0 and 1.
Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.

 */
public class SFindNumberInFibonacciSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int iter = 1;
		int a = 0,b=1;
		int c;
		String isFibNumber = "No";
		for(int i=1;i<=iter;i++) {
			c = a+b;
			if(c<=n) {
				if(c==n) {
					isFibNumber = "Yes";
					break;
				}
				iter+=1;
				a = b;
				b = c;
			}else {
				break;
			}
		}
		System.out.println(isFibNumber);
	}
}
