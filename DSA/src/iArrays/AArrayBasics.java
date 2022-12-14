package iArrays;
/*
Integers store all its values continuosly
index starts from 0
 we can find array lenght using arrName.length
 
 */
public class AArrayBasics {
	
	public static void main(String[] args) {
		//declare an array
		int[] arr = new int[10];
		
		arr[0] = 5;
		System.out.println(arr[0]);//5
		
		//by default values initialized with 0
		System.out.println(arr[1]);//0
		
//		Negative indexing will never be there [starts from 0 to n-1]
//		arr[-1] = 20;
		/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10
	at iArrays.AArrayBasics.main(AArrayBasics.java:17)		 
		 */
		
//		arr[10]=100;
		/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
	at iArrays.AArrayBasics.main(AArrayBasics.java:24)
		 */
		
		char[] cArr = new char[10];
		double[] dArr = new double[10];
		System.out.println(cArr[0]);//will be a null character - looks like space[int terms -0]
		System.out.println(dArr[0]);//0.0
		//for long arr - 0
		//boolean -  false
	}

}
