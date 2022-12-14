package gOperatorsAndForloops;

public class DBitwiseOperators {

	public static void main(String[] args) {
		//using bitwise operator, operations happen bit by bit
		
		int a = 10,b=2;
		
		//bitwise and[both 1 then only 1]
		int c = a & b;
		/*
		 1010
		 0010
		 ====
		 0010 ---->2
		 */
		System.out.println(c);//2
		
		//bitwise or[both 0 then only 0]
		int p = 10 , q = 2;
		int r = p | q;
		/*
		 1010
		 0010
		 ====
		 1010 ---->10
		 */
		System.out.println(r);//10
		
		//bitwise xor[answer will be 0 if both bits are equal,answer will be 1 if both bits are different]
		/*
		  1 1 - 0
		  0 0 - 0
		  0 1 - 1
		  1 0 - 1
		 */
		int l = 10,m=2;
		int n = l^m;
		/*
		 1010
		 0010
		 ====
		 1000 --->8
		 */
		System.out.println(n);//8
		/*
		 important xor properties
		 a ^ a = 0
		 a ^ 0 = a
		 */
		
		//bitwise not[toggles 1 to 0, viceversa]
		int x = 10;
		System.out.println(~x);//-11
	}
}
