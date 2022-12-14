package lTwoDimensionArrays;
/*
All rows are seperate 1 dimension arrays incase of 2d arrays

int[][] arr2d = new int[][];
arr2d is reference of 1d arrays , each row stored as 1d array
each 1d array reference the row of elements

2d array is array of references , those references are 1dimensional array

*/
public class CHow2DArraysStored {

	public static void main(String[] args) {
		int[][] arr2d = new int[3][4];
		System.out.println(arr2d);//[[I@515f550a - represents 2d array
		System.out.println(arr2d[0]);//[I@cac736f - represents a 1d array
		
		int[][] array2d = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(array2d.length);//3 - gives number of rows
		System.out.println(array2d[0].length);//3 - gives number of cols in a particular row
	}
}
