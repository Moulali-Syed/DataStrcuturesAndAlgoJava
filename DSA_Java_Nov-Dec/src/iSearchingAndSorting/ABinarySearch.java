package iSearchingAndSorting;

public class ABinarySearch {

	public static int binarySearch(int[] arr, int seEle) {
		
		int start = 0;
		int end = arr.length-1;
		int mid ;
		while(start<=end) {
			mid = (start+end)/2;
			if(seEle>arr[mid]) {
				start = mid+1;
			}else if(seEle<arr[mid]) {
				end = mid - 1;
			}else {
				return mid;
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {5,12,15,18,23,34,44,56,62,71,81};
		int ind = binarySearch(arr,71);
		System.out.println(ind);
	}
}
