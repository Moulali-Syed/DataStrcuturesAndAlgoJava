package iSearchingAndSorting;

public class EEMergeTwoSortedArrays {

	public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2) {
		int[] mergedArr = new int[arr1.length+arr2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<arr1.length && j< arr2.length) {
			if(arr1[i]<arr2[j]) {
				mergedArr[k] = arr1[i];
				i++;
				k++;
			}else {
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length) {
			mergedArr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			mergedArr[k] = arr2[j];
			j++;
			k++;
		}
		
		return mergedArr;
	}
	public static void main(String[] args) {
		int[] arr1 = {2,6,9,15};
		int[] arr2 = {1,4,6,7};
		int[] res = mergeTwoSortedArrays(arr1,arr2);
		
		for(int p=0;p<res.length;p++) {
			System.out.print(res[p]+"  ");
		}
	}
}

