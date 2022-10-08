package bGettingStartedWithJava;

import java.util.Scanner;

public class FReadInputScannerClass {

	public static void main(String[] args) {
		//we are specifying scanner from where to fetch input
		//is from console - System.in
		int a,b;
		Scanner s  = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		int c = a+b;
		System.out.println(c);
		
		//my scanner here [a,b ] expecting numbers
		/*
		 * if i try to give input as string
		 * then i will get error as InputMismatchExcpetion
		 * 
		 * Exception in thread "main" java.util.InputMismatchException
		 * at bGettingStartedWithJava.FReadInputScannerClass.main(FReadInputScannerClass.java:12)
		 */
		
		//s.next() takes input word by word
		String str = s.next();
		String str1 = s.nextLine();//takes whole line
		
		System.out.println(str);
		System.out.println(str1);
		
		//******TO FETCH A CHAR***********
		String s1 = s.next();
		char ch = s1.charAt(0);//fetching a character at 0th index position
	}
}
