package dRelationalLogicalOperators;

import java.util.Scanner;

public class LFarenheitToCelsiusConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		
		for(int i=s;i<=e;i=i+w) {
			double cel = (i-32)*(5.0/9);
			System.out.println(i+"  "+(int)cel);
		}
	}
}
