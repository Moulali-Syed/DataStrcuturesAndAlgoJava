package jSearchingSorting;
/*
Bubble Sort:

In bubble sort , we compare adjacent elements
say we have an array  6, 9, 4 ,8, 3,1

Round -1 [We achieve here is the largest element is moved to its position]
we compare  - 6 and 9 ---> 6,9,4,8,3,1
Then compare - 9 and 4 ---> 6, 4,9,8,3,1
then compare - 9 and 8 ---> 6, 4, 8,9,3,1
then compare - 9 and 3 -----> 6, 4, 8,3,9,1
then compare - 9 and 1 ------> 6, 4, 8,3,1,9

Round2 : [2 elements will be at correct position]
6 4 8 3 1 9

4 6 8 3 1 9

4 6 8 3 1 9

4 6 3 8 1 9

4 6 3 1 8 9

Round 3:
4 6 3 1 8 9

4 6 3 1 8 9

4 3 6 1 8 9

4 3 1 6 8 9

Round 4:
4 3 1 6 8 9
3 4 1 6 8 9
3 1 4 6 8 9
3 1 4 6 8 9

Round 5:
3 1 4 6 8 9
1 3 4 6 8 9
1 3 4 6 8 9

after every round we place one element at its correct position

for n elements we do n-1 rounds
Bubble sort: after every iteration we are bubbling out the largest element

 */
public class CBubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			//we can iterate upto length-i-1 is enough because the last element in every iteration
			//is getting sorted and is placed in correct position
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {8,2,6,1,5};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
