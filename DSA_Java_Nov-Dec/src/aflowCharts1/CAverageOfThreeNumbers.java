package aflowCharts1;

import java.util.Scanner;

public class CAverageOfThreeNumbers {

	public static double avgCalc(int num1,int num2,int num3) {
		return (num1+num2+num3)/3;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		double avg = avgCalc(n1,n2,n3);
		System.out.println(avg);
	}
}
