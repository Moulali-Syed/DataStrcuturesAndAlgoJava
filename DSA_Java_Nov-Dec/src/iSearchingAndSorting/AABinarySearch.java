package iSearchingAndSorting;

public class AABinarySearch {

	public static int binarySearch(int[] arr, int ele) {

		int start = 0;
		int end = arr.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (ele == arr[mid]) {
				return mid;
			} else if (ele > arr[mid]) {
				start = mid + 1;
			} else if (ele < arr[mid]) {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 10, 15, 32, 35, 40, 45, 60 };
		int seEle = 115;
		int res = binarySearch(arr,seEle);
		
		System.out.println(res);
	}
}
