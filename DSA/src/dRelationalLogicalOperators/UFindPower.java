package dRelationalLogicalOperators;

import java.util.Scanner;

public class UFindPower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int raiseNum = s.nextInt();
		int i=1;
		int prod = num;
		while(i<raiseNum) {
			prod*=num;
			i++;
		}
		
		System.out.println(prod);
		
		System.out.println(Math.round(Math.pow(3, 4)));
		
	}
}
