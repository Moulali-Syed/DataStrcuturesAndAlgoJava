package cHowDataStored;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		binaryToDecimal(n);
	}

	public static void binaryToDecimal(int n) {

		String n1 = Integer.toString(n);
		int sum = 0;
		for(int i=0;i<n1.length();i++) {
				int digit = n%10;
				int pow = (int) Math.pow(2, i);
				sum+=digit*pow;
				n= n/10;
		}
		System.out.println(sum);
	}
}
/*
1010 - 1*2^3+ 0*2^2+1*2^1+0*2^0  = 8+0+2+0 = 10

*/