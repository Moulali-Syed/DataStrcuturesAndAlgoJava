package aFlowCharts;

import java.util.Scanner;

public class KFibonacciNumsUptoN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<n-1;i++) {
			
			int c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}
}
