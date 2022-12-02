package aflowCharts1;

import java.util.Scanner;

public class MCheckPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if(n%i!=0) {
				isPrime = true;
			}else {
				isPrime = false;
				break;
			}
		}
		String res = isPrime ? "Prime Number" :"Composite Number";
		System.out.println(n+" is a "+res);
	}
}
