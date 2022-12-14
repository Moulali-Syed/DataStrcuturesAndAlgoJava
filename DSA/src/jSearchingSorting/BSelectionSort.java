package jSearchingSorting;
/*

Selection Sort:
Arranging elements in ascending order

Say we have an array - 7 2 9 6 1 5 4
lets sort it in ascending order

we will scan the array and look for least number in array
and swap the element

0th round of scan - 1 2 9 6 7 5 4
Round1 			-   1 2 9 6 7 5 4 [scan from second element to end]
Round2 			-   1 2 4 6 7 5 9 [scan from 3rd element to end]
Round3 			-   1 2 4 5 7 6 9 [scan from 4th element to end]
Round4			-   1 2 4 5 6 7 9 [Scan from 5th element to end]
Round5 			-   1 2 4 5 6 7 9 [Scan from 6th element to end]

number of rounds = arr.length-1

 */
public class BSelectionSort {

	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7 ,2, 9, 6 ,1, 5, 4};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
