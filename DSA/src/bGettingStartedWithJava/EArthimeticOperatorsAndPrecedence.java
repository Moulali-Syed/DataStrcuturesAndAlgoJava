package bGettingStartedWithJava;

public class EArthimeticOperatorsAndPrecedence {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a/b);// 3[because both are integers, result will be integer only]
		System.out.println(a%b);//1[gives remainder]
		
		double c = a/b;
		System.out.println(c);//3.0 
		//we get 3 because while calculating it see both as integer
		//then it will try to calculate then store it in double,so only 
		//decimal point is added with 0
		
		int d = 3+2/5;
		System.out.println(d);//3
		
		//follows BODMAS rule
		
		int e = 3/2*5;//[5]
		//it follow associativity- goes from left to right if of same precedence
		System.out.println(e);
		
		int f = b/(2*a);
	}
}

/*
Arthimetic Operators:

+,-,*,/,%
*/