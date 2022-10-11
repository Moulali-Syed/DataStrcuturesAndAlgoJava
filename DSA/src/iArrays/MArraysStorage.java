package iArrays;

public class MArraysStorage {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};//say this is pointing to a memory location 600
		increment(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");// we get 1 2 3 4 5 , because of new used in increment
			//function both arrays are pointing to different locations 
		}
	}

	private static void increment(int[] arr) {//At this point arr refers to same memory location 600
		
		arr = new int[5];//at this we have changed the reference , say now it point to 
		//memory location 200
		
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		
	}
}
