package aflowCharts1;

import java.util.Scanner;

public class QPrintAllPrimes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j!=0) {
					isPrime = true;
				}else {
					isPrime = false;
					break;
				}
			}
			int res = isPrime ? i : 0;
			System.out.print(res+"  ");
		}
	}
}
