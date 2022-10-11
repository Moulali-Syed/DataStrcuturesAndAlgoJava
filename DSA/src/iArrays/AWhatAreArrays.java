package iArrays;

import java.util.Scanner;

public class AWhatAreArrays {
	
	//to create an array
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<size;i++) {
			ar[i] = s.nextInt();
		}
		return ar;
	}

	//print array
	public static void printArr(int input[]) {
		int size = input.length;
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] a = new int[5];
		char[] ch = new char[4];
		boolean bool[] = new boolean[5];
		
		int[] arr = takeInput();
		printArr(arr);
		/*
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		//getting size of array from user and creating array of specified size
		int[] arr = new int[size]; 
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element at "+i+"th position");
			int num = s.nextInt();
			arr[i] = num;
		}
		
		//printing elements in array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		*/
	}
}
/*

*/