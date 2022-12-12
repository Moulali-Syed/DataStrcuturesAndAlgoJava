package jStrings;

public class ILargestSumOfColumn {

	public static int largestSumofCol(int[][] arr) {
		int largestSum  =  Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = 0;
			for(int j=0;j<arr[0].length;j++) {
				sum+= arr[j][i];
			}
			System.out.print(sum+"   ");
			largestSum = sum>largestSum ? sum : largestSum;
		}
		return largestSum;
		
	}
	public static void main(String[] args) {
		int[][] arr = {{1,12,3},{4,5,6},{7,8,9}};
		int res = largestSumofCol(arr);
		System.out.println(res);
	}
}
