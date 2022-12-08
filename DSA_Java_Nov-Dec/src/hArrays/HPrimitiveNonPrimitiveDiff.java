package hArrays;

public class HPrimitiveNonPrimitiveDiff {

	public static void increment(int i) {
		i++;
	}
	public static void incrementArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
	}
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int i =10;
		increment(i);
//		System.out.println(i);
		
		int[] arr = {1,2,3,4,5,6};
		incrementArr(arr);
		printArr(arr);
	}
}
