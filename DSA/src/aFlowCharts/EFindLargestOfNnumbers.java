package aFlowCharts;

import java.util.Scanner;

public class EFindLargestOfNnumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numTimes = s.nextInt();
		int i=1;
		int largest = -1000000;
		while(i<=numTimes) {
			int num = s.nextInt();
			if(num>largest) {
				largest = num;
			}
			i++;
		}
		
		System.out.println(largest);
		
	}
}
