package dRelationalLogicalOperators;

import java.util.Scanner;

public class KSumOfNnumbers {

	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	public void sum() {
		int i =1;
		int sum = 0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
	public void sum(int... sum) {
		int sum1 = 0;
		for(int i=0;i<sum.length;i++) {
			sum1+=sum[i];
		}
		System.out.println(sum1);
	}
	public static void main(String[] args) {
		KSumOfNnumbers obj = new KSumOfNnumbers();
		obj.sum();
		obj.sum(1,2,3);
	}
}
