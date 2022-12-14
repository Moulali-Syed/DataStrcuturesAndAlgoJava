package lTwoDimensionArrays;

import java.util.Scanner;

public class FLargestColumnSum {

	public static int[][] read2dArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = s.nextInt();
		System.out.println("Enter number of cols");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the element at " + i + "th row " + j + "th column");
				int n = s.nextInt();
				arr[i][j] = n;
			}
		}
		return arr;
	}

	public static int largeColSum(int[][] arr) {
		int large = Integer.MIN_VALUE;
		for (int j = 0; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][j];
			}
//			System.out.println(sum);
			if (sum > large) {
				large = sum;
			}
		}
		return large;
	}
	
	public static void main(String[] args) {
		int[][] arr = read2dArray();
		int l = largeColSum(arr);
		System.out.println(l);
	}
}

/*
	1 2 3
	4 5 6
	7 8 9
	
	12 15 18
*/
