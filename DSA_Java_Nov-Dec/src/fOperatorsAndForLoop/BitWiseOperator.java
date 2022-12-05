package fOperatorsAndForLoop;

public class BitWiseOperator {

	public static void main(String[] args) {
		int a  =10;
		int b = 2;
		
		int c = a&b;
		// & -  is bitwise operator , operates at bit level
		
		int d = a|b;
		
		//| - bit wise OR
		
		System.out.println(c+"  "+d);
		
		//^ 
		/*
		 incase of xor(^) answer will be true if both bits are different , false if both are equal
		 
		 1^0  =  1
		 1^1  =  0
		 
		 a^a = 0
		 a^0 = a;
		 */
		
		System.out.println(a^b);//8
		
		//~ - not 
		System.out.println(~a);
		
		
		//bitwise left shift - is like quick doubling
		System.out.println(10<<2);//40  -  10*2^2  = number * 2 ^ positions to be shifted
		System.out.println(10<<3);//80  - 10*2^3
		System.out.println(10<<4);//160 - 10*2^4
		
		//bitwise right shift
		System.out.println(10>>1);//5 - is like quick halving
		System.out.println(10>>2);//2  -  10/2^2  = number / 2 ^ positions to be shifted
		System.out.println(10>>3);//1  -  10/2^3
		System.out.println(10>>4);//0  -  10/2^4
		
		
		System.out.println(100>>2);//25 - 100/2^2
	}
}
