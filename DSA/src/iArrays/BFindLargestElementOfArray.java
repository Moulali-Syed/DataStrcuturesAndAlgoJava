package iArrays;

import java.util.Scanner;

public class BFindLargestElementOfArray {

	public static int[] inputArr() {
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int greatestNumOfArr(int[] arr) {
		int size = arr.length;
		int bigNum = arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]>bigNum) {
				bigNum = arr[i];
			}
		}
		return bigNum;
				
	}
	public static void main(String[] args) {
		int[] ar = {23,14,98,676,36,764,83};
		int largestNumber = greatestNumOfArr(ar);
		System.out.println(largestNumber);
	}
}
