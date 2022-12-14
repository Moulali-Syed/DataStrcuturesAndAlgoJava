package cHowNumbersStored;

public class BHowNegativeNumbersStored {
	public static void main(String[] args) {

	}
}
/*
int i=10;

it will be stored in memory as binary number  1010

int has 4 bytes space - 32 bits
		0 0 0 0 0 ......1 0 1 0
		means remaining all bits will be stored as 0
		
 
 Assume i have 4 bits
 i can store 0000 to 1111
 that is i can store 0 to 15 in 4bits
 
 4 bits - 0 to (2^4) - 1
 if there are n bits we can store 0 to (2^n)-1
*/

/*

Lets have a proposal that we have 4 bits and first represent sign

	say 0 - in 1st bit represents positive number
	say 1 - in 1st bit represents negative number
	
	0111 , 1111 means +7 and -7
	
	what if i want to store 0
	
	0000 , 1000 this creates a problem +0 and -0
	which is not correct , thus our assumption is not correct
	
*/
/*
	The negative numbers are stored in form of 2's complement
	2's complement = 1's complement + 1
	
	2 - 0010
	
	-2 =  1's complement+1
			
			we store 2 as 		0010
								
								  1	
			1's complement is	1101
			 add 1 to this        +1
			 					1110
			 					
			 					1+1 is 2 [10] so 0 and 1 is carry
			 					
	Thus -2 is stored as 1110
*/

/*
Example store -1

	step1: find binary of number - 0001
	step2: find 1's complement   - 1110
	step3: add 1 to 1's complement
	
			1110
			  +1
			1111
*/

/*
find number with its negative binary representation 

	1110
	
	step1: find 1's complement
			0001
	step2: add 1
	          1
			0001
			  +1
			0010
			
			2
*/

/*
if we have 4 bits then we can store - -8 to +7
for n bits  -  -(2^(n-1))  to (2^(n-1))-1

4bytes - int - -2^31 to (2^31) - 1
2bytes - short -  -2^15 to (2^15)-1
*/