package dRelationalLogicalOperators;

import java.util.Scanner;

public class ICheckCharacterCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		
		int n = ch;
//		System.out.println(n);
		
		if(n>=97 && n<=122) {
			System.out.println(0+" is lower case alphabet");
		}else if(n>=65 && n<= 90) {
			System.out.println(1+" is upper case alphabet");
		}else {
			System.out.println(-1+" is not an alphabet");
		}
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(1);
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}
		
	}
}
