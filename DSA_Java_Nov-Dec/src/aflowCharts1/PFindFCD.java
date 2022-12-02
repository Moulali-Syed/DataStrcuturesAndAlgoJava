package aflowCharts1;

import java.util.Scanner;

public class PFindFCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		int small = n1>n2 ? n2 :n1;
		int gcd = 1;
		for(int i=1;i<small;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
