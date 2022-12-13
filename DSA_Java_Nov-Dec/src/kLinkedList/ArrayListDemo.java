package kLinkedList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(10);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(30);
		
		System.out.println(arr.size());
		
		System.out.println(arr.get(0));
		arr.set(1, 500);
		
		ArrayList<Integer> al = new ArrayList<Integer>(20);
		al.add(0,100);
		
		arr.remove(0);
		Integer e = 10;
		arr.remove(e);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("======================================");
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
