package aFlowCharts;

import java.util.Scanner;

public class HSumOfEvenNums {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for(int i=2;i<=num;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
