package gOperatorsAndForloops;

public class EBitWiseOperatorsCont {

	public static void main(String[] args) {
		
		int a = 10;
		//bitwise left shift[***generally left shift is used for doubling]
		System.out.println(a<<1);//20
		/*
		 a  			1010
		 left shift by1 
		 			   10100 = 20
		 			   that is move one bit forward
		 */
		//there is scenario where last between digit is 1, move to left , turns to negative
		//but left shift mainly used for doubling in general, have above word in mind as well
		//in left shift , left most bit always filled with 0
		System.out.println(a<<3);//80 - [20--40--80]
		
		//bitwise right shift
		/*
		 the left most bit is sign bit in right shift, it will be zero if positive
		 1 if negative
		 
		 a>>1 - move all bits by 1 position forward
		 */
		System.out.println(a>>1);//5
		/*
		 		...	000	0000 1010
		 rightshiftby1  0000 0101 - last digit is ommited
		 
		 				=========
		 					5
		 					
		 right shift works as halving the value, left shift works as doubling the value
		 */
		System.out.println(a>>2);//2
	}
}
