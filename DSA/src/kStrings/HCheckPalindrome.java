package kStrings;

import java.util.Scanner;

/*
Check Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false'.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1 :
abcdcba
Sample Output 1 :
true 
Sample Input 2:
coding
Sample Output 2:
false
 */
public class HCheckPalindrome {

	public static boolean checkPalindrome(String str) {
		String revSt = "";
		for(int i=str.length()-1;i>=0;i--) {
			revSt+=str.charAt(i);
		}
		if(str.equals(revSt)) {
			return true;
		}
		return false;
	}
	
	public static boolean checkPalindrome2(String str) {
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
			}else {
				continue;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		String st = s.nextLine();
		/*
		boolean res = checkPalindrome(st);
		String pr = res?" is Palindrome":" is not Palindrome";
		System.out.println(st+""+pr);
		*/
		boolean re = checkPalindrome2(st);
		System.out.println(re);
	}
}
