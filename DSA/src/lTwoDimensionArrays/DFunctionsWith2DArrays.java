package lTwoDimensionArrays;

import java.util.Scanner;

public class DFunctionsWith2DArrays {

	public static int[][] read2dArray(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = s.nextInt();
		System.out.println("Enter number of cols");
		int cols  = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the element at "+i+"th row "+j+"th column");
				int n = s.nextInt();
				arr[i][j] = n;
			}
		}
		return arr;
	}
	
	public static void print2dArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] inputArr = read2dArray();
		print2dArray(inputArr);
	}
}
