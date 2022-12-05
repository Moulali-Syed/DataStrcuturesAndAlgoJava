package dConditionalsAndLoops;

import java.util.Scanner;

public class HFarenheit2CelsiusTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//C = [(°F-32)×5]/9
		
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		for(int i=start;i<=end;i+=step) {
			System.out.println(i+"   "+((i-32)*5)/9);
		}
	}
}
