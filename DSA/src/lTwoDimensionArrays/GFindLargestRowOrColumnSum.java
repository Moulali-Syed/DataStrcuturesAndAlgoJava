package lTwoDimensionArrays;

import java.util.Scanner;

public class GFindLargestRowOrColumnSum {

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

	public static void largestRowOrColumn(int[][] arr) {
		int largeSum = Integer.MIN_VALUE;
		int ind = 0;
		String st="";
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
			}
			if(sum>largeSum) {
				largeSum = sum;
				ind = i;
				st = "row";
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			int sum = 0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
			}
			if(sum>largeSum) {
				largeSum = sum;
				ind = j;
				st = "column";
			}
		}
		System.out.println(st+" "+ind +" "+largeSum);
	}
	public static void main(String[] args) {
		int[][] arr = read2dArray();
		largestRowOrColumn(arr);
	}
}
