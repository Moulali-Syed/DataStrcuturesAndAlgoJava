package aflowCharts1;

import java.util.Scanner;

public class AaddTwoNumbers {

	
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = s.nextInt();
		System.out.println("Enter second number");
		int num2 = s.nextInt();
		
		System.out.println("The sum of two numbers is "+add(num1,num2));
	}
}
