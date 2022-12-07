package hArrays;

import java.util.Scanner;

public class CDemoArray {

	public static void main(String[] args) {
//		int[] arr  =  new int[10];
		
//		arr[1] = 10;
		
		Scanner s  =  new Scanner(System.in);
		int size = s.nextInt();
		
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter an element at index "+i);
			arr[i] = s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//find largest element in array
		
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
