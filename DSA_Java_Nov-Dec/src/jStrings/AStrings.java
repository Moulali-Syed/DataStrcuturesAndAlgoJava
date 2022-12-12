package jStrings;
//String - instead of storing in character array we can use string
public class AStrings {

	public static void printCharactersFromString(String st) {
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		String str = "abcdefgh";
		
		System.out.println(str.length());
		
		System.out.println(str.substring(0));
		System.out.println(str.substring(str.length()));
		System.out.println(str.substring(2));
		System.out.println(str.substring(1,5));
		
		System.out.println(str.contains("def"));
		
		System.out.println(str.charAt(2));
		
		printCharactersFromString("Apple Mango");
	}
}
