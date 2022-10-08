package cHowNumbersStored;

/*
 * BinaryNumber System
 * is a base 2 , number system
 * we have 0,1 and we call this as bits
 * 
 * Any base N , number system will have 0 t0 N-1 values
 * i.e , N unique digits
 * 
 * base 10
 * we have 0 to 9
 * 
 * When we say int a = 10; this will be internally changing to binary
 *  
 */

/*
 Conversion of Decimal to Binary Number:
 	
 	divide the number with 2, and the last digit is most significant bit
 	
 	2 | 10
 	2 |  5 | 0 [LSB]
 	2 |  2 | 1
 	2 |  1 | 0
 	2 | 0  | 1 [MSB]
 	
 	 Now read bottom to top  1010 - 1 is most significant bit here
 	 								0 is least significant bit
 */

/*
 * 
 *We can convert any base to any
 *general conversion formula is to divide number by base
 *	base | number 
 *	base | number | remainder
 *	base | number | remainder
 *	.
 *	.
 *	.
 *
 *Base 8 - Octal
 *Base 16 - HexaDecimal
 */
public class ABinaryNumberSystem {

	public static void main(String[] args) {
		
	}
}

/*

Binary to decimal converion:
	(10111)2
	
	recall of expanded notation - 1234 - 1*10^3+2*10^2+3*10^1+4*10^0
	
	10111 - 1*2^4+0*2^3+1*2^2+1*2^1+1*2^0

*/

/*
Example:
convert 15 to binary

	2|15
	2|7|1
	2|3|1
	2|1|1
	2|0|1
	
		1111 - is binary representation of 15
		
convert 1111 binary to decimal value
	
		1*2^3+1*2^2+1*2^1+1*2^0 = 8+4+2+1 = 15
	
*/