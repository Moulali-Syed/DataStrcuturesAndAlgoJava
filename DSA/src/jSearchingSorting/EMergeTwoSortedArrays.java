package jSearchingSorting;

//Merge two sorted arrays - the merged array should also be sorted
public class EMergeTwoSortedArrays {

	public static int[] mergeArr(int[] arr1,int[] arr2) {
		int[] mergeArr = new int[arr1.length+arr2.length];
		int k = 0;
		int i = 0;
		int j = 0;
		for(;i<arr1.length&&j<arr2.length;) {
			
			if(arr1[i]<arr2[j]) {
				mergeArr[k] = arr1[i];
				k++;
				i++;
			}else {
				mergeArr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		for(;i<arr1.length;) {
			mergeArr[k] = arr1[i];
			i++;
			k++;
		}
		for(;j<arr2.length;) {
			mergeArr[k] = arr2[j];
			j++;
			k++;
		}
		
		return mergeArr;
	}
	public static void main(String[] args) {
		int[] arr1 = {2,4,5,9};
		int[] arr2 = {1,7,13,19};
		int[] mergeAr = mergeArr(arr1,arr2);
		for(int i=0;i<mergeAr.length;i++) {
			System.out.print(mergeAr[i]+" ");
		}
		
	}
}
/*
package fSearchingSorting;

public class EMergeTwoSortedArrays {

	public static int[] merge(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;

		int[] ans = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}

		while (i < arr1.length) {
			ans[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr1 = {2,4,5,9};
		int[] arr2 = {1,7,13,19};
		int[] mergeArr = merge(arr1, arr2);
		for (int i = 0; i < mergeArr.length; i++) {
			System.out.print(mergeArr[i] + " ");
		}
	}
}
*/