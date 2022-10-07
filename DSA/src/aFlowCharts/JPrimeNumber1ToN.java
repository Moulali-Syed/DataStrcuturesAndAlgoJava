package aFlowCharts;

import java.util.Scanner;

public class JPrimeNumber1ToN {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=2;i<=num;i++) {
			int count = 0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
