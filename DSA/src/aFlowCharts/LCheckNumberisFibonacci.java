package aFlowCharts;

import java.util.Scanner;

public class LCheckNumberisFibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		int b = 1;
		int isFibonacci = 0;
		if(n==0 || n==1) {
			isFibonacci = 1;
		}else {
			int c;
			for(int i=1;i<=n;i++) {
				c = a+b;
				a = b;
				b=c;
				if(n==c) {
					isFibonacci = 1;
				}
			}
		}
		
		String res = isFibonacci == 1?"Fibonacci":"Not Fibonacci";
		System.out.println(res);
	}
}

