package gOperatorsAndForloops;

public class FAssignmentOperator {

	public static void main(String[] args) {
		int a = 10;

		a += 1;// same as a = a+1
		// we have -= , *= ,/= %=

		int b = 10;
		b ^= 1;
		/*
		 b = b^1
		 1010
		 0001
		 ====
		 1011 ----> 11
		 */
		
		int c = 10;
		System.out.println(c<<1);//equivalent to multiplying by 2 [20]
		//we can use >> also
	}
}
