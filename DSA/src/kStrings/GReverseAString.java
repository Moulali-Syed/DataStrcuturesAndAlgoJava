package kStrings;

import java.util.Scanner;

public class GReverseAString {

	public static String reverseString(String str) {
		String reversedString = "";
		for(int i=str.length()-1;i>=0;i--) {
			reversedString+=str.charAt(i);
		}
		return reversedString;
	}
	
	public static String revStr(String st) {
		String revStr = "";
		for(int i=0;i< st.length();i++) {
			revStr = st.charAt(i)+revStr;
		}
		return revStr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String  str = s.nextLine();
		String st = reverseString(str);
		System.out.println(st);
		
		String revSt = revStr(str);
		System.out.println(revSt);
	}
}
