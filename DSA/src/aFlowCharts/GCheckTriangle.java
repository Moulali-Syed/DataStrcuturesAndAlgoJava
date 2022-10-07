package aFlowCharts;

import java.util.Scanner;

public class GCheckTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1 == n2 && n2 == n3) {
			System.out.println("Equilateral triangle "+ 1);
		}else if(n1==n2 || n1==n3) {
			System.out.println("Isoceles Triangle "+ 0);
		}else {
			System.out.println("All three sides unequal - Scalene Triangle "+-1);
		}
	}
}
