package kStrings;

import java.util.Scanner;

public class DTakeInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//delimiter - space , enter ,tab 
		
		String str1 = s.next();
		String str2 = s.next();//deals with each token
		
		System.out.println(str1+" "+str1.length()+"  "+str2+" "+str2.length());
		
		String str3 = s.nextLine();
		System.out.println(str3+" "+str3.length());
	}
}
