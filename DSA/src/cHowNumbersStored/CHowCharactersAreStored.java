package cHowNumbersStored;

public class CHowCharactersAreStored {

	public static void main(String[] args) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		System.out.println(min+" "+max);
		
		char ch = 'a';
		//char in java is 16 bits long[2bytes]
		
		System.out.println('a'+3);//100
		
		int i = 'a'+3;
		System.out.println(i);//100
		
		System.out.println('a'+'a');//194
			
	}
}
/*

char are stored as ascii values

a - 97
b - 98

A - 65

0 - 48
*/