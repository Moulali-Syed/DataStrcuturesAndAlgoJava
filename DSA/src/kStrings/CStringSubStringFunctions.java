package kStrings;

public class CStringSubStringFunctions {

	public static void main(String[] args) {
		String str = "Coding";
		System.out.println(str.substring(2));//we can pass start index ,here it is 2
		//it will print till end
		//ding
		
		//if we pass the string length , we get empty string
		System.out.println(str.substring(str.length()));
//		System.out.println(str.substring(str.length()+1));//java.lang.StringIndexOutOfBoundsException:
	
		//we can pass start and end index
		System.out.println(str.substring(1,5));//odin
		//[gives start-end charcaters - starts from 1 till 4th index elements]
		
//		System.out.println(str.substring(1,7));//error - java.lang.StringIndexOutOfBoundsException: 
	}
}
