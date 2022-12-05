package dConditionalsAndLoops;

import java.util.Scanner;

public class BasicsOfConditionals {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		
		System.out.println("outside if else");
	}
}
