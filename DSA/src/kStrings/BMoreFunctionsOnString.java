package kStrings;

public class BMoreFunctionsOnString {

	public static void main(String[] args) {
		
		String str1 = "Coding";
		String str2  = "is Simple";
		//concatenating strings
		
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		//compare 2 string
		System.out.println(str1.equals(str2));
		
		//The compareTo() method compares two strings lexicographically. 
//		The comparison is based on the Unicode value of each character in the strings. 
//		The method returns 0 if the string is equal to the other string.
		//if length is not equal it returns difference in length
		
		System.out.println(str1.compareTo(str2));//compares character by charcater
		//as soon as it finds mismatch , it will display difference between their ASCII values
		
		//contains
		System.out.println(str1.contains("ing"));
	
	}
}
