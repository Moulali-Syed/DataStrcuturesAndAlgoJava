package slinkedList1;

import java.util.ArrayList;

public class CRemoveeConsectiveDuplicates {

	public static ArrayList removeConsecutiveDuplicates(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(al.get(al.size()-1)==arr[i]) {
				continue;
			}else {
				al.add(arr[i]);
			}
		}
		return al;
	}
	
	public static ArrayList removeConsecutiveDuplicates1(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				al.add(arr[i]);
			}
		}
		return al;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,10,20,20,20,30,40,40,10};
//		ArrayList<Integer> al = removeConsecutiveDuplicates(arr);
		
		ArrayList<Integer> al = removeConsecutiveDuplicates1(arr);

		for(int i:al) {
			System.out.print(i+" ");
		}
	}
}
