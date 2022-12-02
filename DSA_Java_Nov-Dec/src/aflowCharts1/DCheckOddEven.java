package aflowCharts1;

import java.util.Scanner;

public class DCheckOddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		
		if(num%2 == 0) {
			System.out.println(num+" is Even");
		}else {
			System.out.println(num+" is Odd");
		}
		
		String res = num%2 == 0 ? "Even" : "Odd";
		
		System.out.println(num +" is "+res);
	}
}
