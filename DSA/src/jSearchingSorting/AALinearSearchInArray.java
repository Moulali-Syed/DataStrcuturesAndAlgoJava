package jSearchingSorting;

public class AALinearSearchInArray {

	public static int searchArr(int[] arr,int ele) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println(arr[i]+" is at index position  "+i);
				return i;
			}
		}
		return Integer.MIN_VALUE;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5,6,7,9,12,87,34,21};
		int se = 12;
		int index = searchArr(ar,se);
		System.out.println(ar[index]);
	}
}
