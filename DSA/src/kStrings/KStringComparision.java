package kStrings;

public class KStringComparision {

	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {1,2};
		if(arr1==arr2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		//Both arrays are not equal because , the memory address where both are saved is 
		//different
		System.out.println(arr1+"  "+arr2);//[I@379619aa  [I@cac736f
		
		//lets see in case of strings
		String str1 = "abc";
		String str2 = "abc";
		if(str1==str2) {
			//because of string pool we get that both are equal
			System.out.println("strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		String str3 = new String("abc");
		if(str1==str3) {
			System.out.println("equal");
		}else {
			//both are not equal because , str3 will be stored in heap area
			//instead of string pool
			System.out.println("not equal");
		}
		
		//our intent is to compare string values
		//its always better to compare using .equals method, because String is non primitive
		//we donot know by which way it might be created
		if(str1.equals(str3)) {
			System.out.println("content is equal");
		}
		
		//contains
		String s1 = "abc";
		String s2 = "";
		System.out.println(s1.contains(s2));//true
		
	}
}
