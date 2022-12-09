package iSearchingAndSorting;
/*
We find and arrange elements in ascending order
 */
public class BSelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			//traversing from 0 to length-2
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != -1) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,9,2,41,6,1,12,54,93};
		selectionSort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[5]);
	}
}
