package aflowCharts1;

import java.util.Scanner;

public class KPrintEvenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=2;i<=n;i+=2) {
			System.out.println(i);
		}
	}
}
