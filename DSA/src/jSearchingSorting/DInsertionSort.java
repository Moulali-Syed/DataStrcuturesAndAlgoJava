package jSearchingSorting;
/*
Insertion Sort: choose one card and insert it to its right position
Say i have a deck of cards of count 5
 i will pick a card , and then check pick the second and arrange them in
 ascending order
 Then take 3rd card and place it in its correct position
 
 Say i have an array
  9 8 5 6 2 1
  
  i will pick one element and place it at 0th index - 9
  then will pick 2nd element and compare with the element present 
  if picked element is greater place it at 0th index and move existing element
  to next index
  
  9 8 5 6 2 1
  8 9 5 6 2 1  --- iteration 1
  5 8 9 6 2 1
  5 6 8 9 2 1
  2 5 6 8 9 1
  1 2 5 6 8 9
 */
public class DInsertionSort {

	public static void insertionSort(int[] arr) {
		int temp;
		int j;
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
			j = i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,6,2,4,3};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
