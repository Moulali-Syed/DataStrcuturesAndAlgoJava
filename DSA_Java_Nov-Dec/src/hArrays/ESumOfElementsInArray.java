package hArrays;

import java.util.Scanner;

public class ESumOfElementsInArray {

	
	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int times = s.nextInt();
		for(int i=0;i<times;i++) {
			int[] arr = takeInput();
			int sum = sumOfElements(arr);
			System.out.println(sum);
		}
	}
}
