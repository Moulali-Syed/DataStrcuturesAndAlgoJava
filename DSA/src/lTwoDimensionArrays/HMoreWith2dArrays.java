package lTwoDimensionArrays;

public class HMoreWith2dArrays {

	public static void main(String[] args) {
		int[][] arr=new int[3][];
		
		System.out.println(arr);//[[I@515f550a
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		/*
null
null
null
		 */
//		System.out.println(arr[0][0]);//java.lang.NullPointerException: Cannot load from int array because "arr[0]" is null
		int[][] newArr = new int[3][4];
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
		/*
[I@cac736f
[I@5e265ba4
[I@156643d4
		 */
	}
}
//Number of columns is not same then it is jagged array
