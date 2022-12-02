package aflowCharts1;

import java.util.Scanner;

public class EFindLargestOf3Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1>=n2 && n1>=n3) {
			System.out.println(n1+" is greater");
		}else if(n2>n1 && n2>n3) {
			System.out.println(n2 +" is greater");
		}else {
			System.out.println(n3+" is greater");
		}
	}
}
