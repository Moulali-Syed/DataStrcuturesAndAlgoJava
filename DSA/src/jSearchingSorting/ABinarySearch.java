package jSearchingSorting;

/*
Binary Search is better than Linear Search
*** The condition for binary search is Array must be sorted *****
Binary Search can only work upon sorted array

Say we have an array 
	6 10 15 32 35 40 45 60
	0 1  2  3  4   5  6  7  --[index positions]
	
We will find the middle index
	midIndex = (startIndex+endInd)/2
	
Then we compare the search element , with element at midIndex
if they are equal then i found my answer

if not then we check whether the search element is greater than or less than midIndex element

if searchElement is greater , check to the right side , i.e from midIndex+1 to end
if searchElement is less , check from midIndex-1 i.e left side[start to midIndex-1]

continue...

if start>end , then element is not present
 */
public class ABinarySearch {

	public static int binarySearch(int[] arr,int se) {
		
		int start = 0;
		int end = arr.length-1;
		int mid  = 0;
		for( start=0;start<=end;) {
			mid = (start+end)/2;
			
			if(arr[mid]==se) {
				return mid;
			}else if(arr[mid]>se) {
				
				end = mid-1;
			}else if(arr[mid]<se) {
				start = mid+1;
				
			}
		}
		return -1;
	}
	
	public static int binarySearchWhile(int[] arr,int sEle) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==sEle) {
				return mid;
			}else if(sEle>arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int se = 4;
//		int se = 2;
//		int se = 7;
//		int se = 12;
		int ind = binarySearch(arr,se);
		System.out.println(ind);
		
		int ind1 = binarySearchWhile(arr,se);
		System.out.println(ind1);
	}
}
