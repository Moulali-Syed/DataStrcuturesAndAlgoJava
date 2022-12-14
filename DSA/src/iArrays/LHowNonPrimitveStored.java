package iArrays;

public class LHowNonPrimitveStored {

	public static void incrementArr(int[] input) {
		for(int i=0;i<input.length;i++) {
			input[i] = input[i]+1;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);//[I@515f550a
		incrementArr(arr);
		System.out.println(arr);//[I@515f550a
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
/*
Unlike primitive variables , changes here are reflecting
arr is a reference to memory location , but not the actual memory location

arr and input points to same memory location
*/