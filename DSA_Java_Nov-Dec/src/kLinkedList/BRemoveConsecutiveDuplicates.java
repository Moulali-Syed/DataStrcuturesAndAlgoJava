package kLinkedList;

import java.util.ArrayList;

public class BRemoveConsecutiveDuplicates {

	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr[0]);
		for(int i=1;i<arr.length;i++ ) {
			if(arr[i] != arr[i-1]) {
				al.add(arr[i]);
			}
		}
		return al;
	}
	public static void main(String[] args) {
		int[] arr = {10,10,20,20,30,30,40,50,50,50,10,70,70,20};
		ArrayList<Integer> al = removeDuplicates(arr);
		
		for(int ele:al) {
			System.out.print(ele+" ");
		}
	}
}
