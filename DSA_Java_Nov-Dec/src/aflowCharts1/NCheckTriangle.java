package aflowCharts1;

import java.util.Scanner;

public class NCheckTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();
		
		if(s1==s2 && s1==s3 && s3==s2) {
			System.out.println("Equilateral Triangle");
		}else if(s1==s2 || s2==s3 || s3==s1) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scalene Triangle");
		}

	}
}
