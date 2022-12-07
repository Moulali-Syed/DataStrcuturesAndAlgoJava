package hArrays;
/*
We can use array to store many values into a single variable

we can store elements continuosly and can access element we require
 */
public class AIntroToArrays {

	public static void main(String[] args) {
		//Declaring an array
		
		int arr[] = new int[5];
		//we have to use new keyword to get memory allocated and specify the number of elements in array
		
		//set element in array
		arr[0] = 5;//we can access array elements using index value
		//in array we have index values as 0,1,2,3,4,5....
		
		//negative index is not allowed
		//if our array is of size 10 , indexing will be from 0 to 9
		//if we try to access arr[-1] or arr[10] we get ArrayIndexOutOfBoundsException
		
		//access element in array
		System.out.println(arr[0]);
		
		//check the default value - this depends on dataType
		System.out.println(arr[3]);
		
	}
}
