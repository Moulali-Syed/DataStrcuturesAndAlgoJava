package cHowNumbersStored;

public class DTypeConversion {

	public static void main(String[] args) {
		char ch = 'a';
		int i = ch;//implicit type cast
		System.out.println(i);//97
		//its absoultely fine to store character value into int value
		//because char is 2 bytes , int is 4 bytes
		
		//ch = i;// cannot convert from int to char
		//opposite is not possible
		//if we want to do we can do explicit conversion
		ch = (char)i;
		
//		ch = ch+1;//is also error because 97+1 results in 98 which is of int type
		//a bigger datatype cannot be stored in smaller datatype
		ch = (char) (ch+1);//explicit type cast
		
		
		// by default all decimal are double
		float f = (float)10.7;
		double h = f;
		
		int m = (int)10.7;
		
		System.out.println(2/5);//0
		System.out.println(2.0/5);//0.4
	}
}
