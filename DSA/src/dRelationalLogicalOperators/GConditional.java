package dRelationalLogicalOperators;

public class GConditional {

	public static void main(String[] args) {
		int a = 50;
		int b = Integer.MIN_VALUE;
		if(a/0 == b) {
			System.out.println("hello");
		}else {
			System.out.println("hi");
		}
	}
}
//output
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at dRelationalLogicalOperators.GConditional.main(GConditional.java:8)
*/