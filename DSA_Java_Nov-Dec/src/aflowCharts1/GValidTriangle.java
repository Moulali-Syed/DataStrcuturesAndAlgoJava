package aflowCharts1;

import java.util.Scanner;

public class GValidTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int side1 = s.nextInt();
		int side2 = s.nextInt();
		int side3 = s.nextInt();
		
		if(side1+side2>side3 && side2+side3>side1 && side1+side3> side2) {
			System.out.println("Triangle can be formed");
		}else {
			System.out.println("Triangle cannot be formed");
		}
	}
}
