package kStrings;

import java.util.Scanner;

public class NReverseEachWord {

	public static String reverseStr(String st) {
		String revStr = "";
		for(int i=st.length()-1;i>=0;i--) {
			revStr+=st.charAt(i);
		}
		return revStr+" ";
	}
	public static void reverseEachWord() {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String[] stArr = s1.split(" ");
		String rev = "";
		for(int i=0;i<stArr.length;i++) {
			rev+=reverseStr(stArr[i]);
		}
		System.out.println(rev.trim());
		
	}
	public static void main(String[] args) {
		reverseEachWord();
	}
}
