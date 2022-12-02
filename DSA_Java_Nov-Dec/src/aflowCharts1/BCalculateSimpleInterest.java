package aflowCharts1;

import java.util.Scanner;

public class BCalculateSimpleInterest {

	public static double calcSI(int principal,int time, int interest) {
		return (principal*time*interest)/100;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int t = s.nextInt();
		int r = s.nextInt();
		
		System.out.println("SI is "+calcSI(p,t,r));
	}
}
