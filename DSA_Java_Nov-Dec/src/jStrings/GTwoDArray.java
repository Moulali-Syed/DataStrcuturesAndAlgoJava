package jStrings;

import java.util.Scanner;

public class GTwoDArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter element at "+i+" th row and "+j+" th column");
				arr[i][j]= s.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
