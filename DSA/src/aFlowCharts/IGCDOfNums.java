package aFlowCharts;

import java.util.Scanner;

public class IGCDOfNums {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int gcd = 1;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
