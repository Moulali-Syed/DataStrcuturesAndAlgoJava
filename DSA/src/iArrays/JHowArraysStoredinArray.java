package iArrays;

/*
DataTypes
Primitives 						NonPrimitives
int								String,Array,Scanner, etc
char
double 
boolean

when we say 
int i = 10;
i is the memory location name where the 4 bytes of memory is reserved for 10 value

int[] arr = new int[10];
arr is reference to a memory location 
 */
public class JHowArraysStoredinArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		//[I@515f550a  - [ represents 1 dimensional , I represents Integer type ,@515f550a
		//is memory address
	}
}
