package bGettingstartedWithJava;

public class DArthimeticOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = a/b;
		
		System.out.println(c);//0
		
		double d = 10.0/20.0;
		System.out.println(d);//0.5
		
		double e = a/b;
		System.out.println(e);//0.0
		
		//follows BODMAS rule
		System.out.println(10/2*5);//25
		System.out.println(10/(2*5));//1
	}
}
