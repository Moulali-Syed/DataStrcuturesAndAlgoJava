package dConditionalsAndLoops;

public class ARelationalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		
		//Logical operators
		int c = 20;
		int d = 21;
		System.out.println(a>b && c>d);
		System.out.println(a>b || c>d);
		System.out.println(a!=b);
		
		double e = 55.5;
		int f = 55;
		e = e%10;
		f = f%10;
		System.out.println(e+" "+f);
	}
}
