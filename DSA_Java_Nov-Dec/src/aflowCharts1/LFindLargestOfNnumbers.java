package aflowCharts1;

import java.util.Scanner;

public class LFindLargestOfNnumbers {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int largest = Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter number "+i);
			int num = s.nextInt();
			if(num>largest) {
				largest = num;
			}
		}
		System.out.println(largest+" is largest number");
	}
}
