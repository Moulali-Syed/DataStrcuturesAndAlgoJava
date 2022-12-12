package jStrings;
/*
Reverse String Word Wise

Reverse the given string word wise. 
That is, the last word in given string should come at 1st place, 
last second word at 2nd place and so on. Individual words should remain as it is.
Input format 
String in a single line
Output format 
Word wise reversed string in a single line
Constraints 
0 = S = 10^7
where S represents the length of string, S.
Sample Input 1
Welcome to Coding Ninjas
Sample Output 1
Ninjas Coding to Welcome
Sample Input 2
Always indent your code
Sample Output 2
code your indent Always
 */
public class FReverseStringWordWise {

	public static String reverse(String st) {
		String rev = "";
		for(int i=st.length()-1;i>=0;i--) {
			rev+=st.charAt(i);
		}
		return rev;
	}
	public static void reverseEachWord(String str) {
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.print(reverse(words[i])+" ");
		}
		System.out.println();
	}
	
	public static void revSentence(String st) {
		String[] words = st.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}
	public static void main(String[] args) {
		reverseEachWord("Welcome to Coding Ninjas");
		revSentence("Welcome to Coding Ninjas");
	}
}
