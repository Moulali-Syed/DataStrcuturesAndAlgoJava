package lTwoDimensionArrays;

public class ATwoDimensionArray {

	public static void main(String[] args) {
		//2d array
		
		int[][] arr = new int[3][4];
		//here 3 - represents rows , 4 - represents columns
		arr[0][2] = 10;//we can insert values in a particular cell
		
		System.out.println(arr[0][0]);//default value is zero - Integer Array
		System.out.println(arr[0][2]);//10
	}
}
