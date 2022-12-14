package kStrings;
/*
In java we have stack memory and heap memory

Whatever local variables we are creating they go to stack, the function calls
we are making will also be in call stack

But in case of a non primitive
Suppose consider an array
int[] arr = new int[10];

this arr is not the actual array , actual array is created some where
this arr will hold the address of the array
the actual array is stored in heap , arr [reference variable ] will be stored in stack

Heap is relatively big compared to Stack

*/
public class IHowStringsStored {

	public static void main(String[] args) {
		//we can create string in 2 ways
		
		//method1
		//in this case there is a chance that our string will be stored in StringPool
		//StringPool is an area with in heap
		//The concept of String pool came because of space optimization
		String str = "Apple";//At this line java will create a string inside stringpool
		//as "Apple" 
		
		String str1 = "Apple";//At this line java will check in stringpool if its 
		//already present , if present the JRE will only return a reference to that instead of creating a new string
		
		String st = new String("Apple");//But here we used new keyword, then java will create a
		//new string outside stringpool within heap
//		st - the actual value is stored in heap , and its reference variable
//		i.e st will be stored in stack
	}
}
