package jStrings;

public class DPrintPrefixesInString {

	public static void print(String str) {
		int i = 0;
		for (int j = 0; j <= str.length(); j++) {
			System.out.println(str.substring(i, j));
		}
	}

	public static void main(String[] args) {
		print("abcde");
	}
}
