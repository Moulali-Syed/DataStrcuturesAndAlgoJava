package aFlowCharts;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=2;
		int flag = 0;
		while(i<num) {
			if(num%i==0) {
				flag = 1;
				break;
			}
			i++;
		}
		String res = flag==0?"Yes":"No";
		System.out.println(res);
	}
}
