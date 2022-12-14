package kStrings;

public class AStringIntro {

	public static void main(String[] args) {
		char[] arr = {'C','o','d','i','n','g'};
		String str = "Coding";
		
		System.out.println(str.length());//6
		
		//String also internally stores all charcaters internally in a char array
		//we have indexing in string
		System.out.println(str.charAt(0));//C
		
		String str1 = "";//empty string
		System.out.println(str1.length());//0
		
		String str2 = " ";
		System.out.println(str2.length());//1
		
//		System.out.println(str.charAt(-1));//java.lang.StringIndexOutOfBoundsException:
		
//		System.out.println(str.charAt(10));//java.lang.StringIndexOutOfBoundsException:
	}
}
/*
to store a collection of characters

we can store in a char array or in String

char[] arr = {'C','o','d','i','n','g'};
String str = 'Coding';

It is better to store in a string because it has many inbuilt functions
String is a non primitive datatype
*/