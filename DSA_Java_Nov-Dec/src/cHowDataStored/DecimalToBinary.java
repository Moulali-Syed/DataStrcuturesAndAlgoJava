package cHowDataStored;

import java.util.Scanner;

public class DecimalToBinary {

	public static void decimal2Binary(int num) {
		
		int remainder;
		String binaryNum = "";
		while(num!=0) {
			int n = num;
			remainder = n%2;
//			System.out.print(remainder);
			binaryNum+=remainder;
			num = n/2;
		}
		System.out.println(binaryNum);
		revString(binaryNum);
	}
	
	public static void revString(String n) {
		for(int i=n.length()-1;i>=0;i--) {
			System.out.print(n.charAt(i));
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		decimal2Binary(num);
		
	}
}
/*
Decimal to Binary

say i have got a number - 10
to convert it to binary

	2 | 10 |
	2 | 5  | 0
	2 | 2  | 1
	2 | 1  | 0
	  | 0  | 1
	  
	  binary number is 1010
*/