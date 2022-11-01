package slinkedList1;

import java.util.ArrayList;

/*
 * In array we have to define size
 * say i made an array of 1000 , if my data is more then myarray is not enough
 * if less my memory is wasted
 * 
 * one way is to use a dynamic array
 * 
 * Something similar is already present in java - ArrayList
 * 
 * 
 */
public class BIntroToArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);//adds element at end of arraylist
		al.add(20);
		al.add(30);
		
		System.out.println(al.size());//3
		
		System.out.println(al.get(2));//30
		
		al.add(1, 80);
		System.out.println(al.get(1));//80
		
		System.out.println(al.size());//4
		
		al.set(2, 90);
		System.out.println(al.size());//4
		System.out.println(al.get(2));//90
		
		al.remove(0);
		System.out.println(al.get(0));
		System.out.println(al.size());//3
		
		Integer i = 90;
		al.remove(i);
		System.out.println(al.size());//2
		
		System.out.println("-------------------------------------");
		for(int j=0;j<al.size();j++) {
			System.out.println(al.get(j));
		}
		
		//enhanced for loop - use forwach only to iterate but not to change elements in arraylist
		for(int k:al) {
			System.out.print(k+" ");
		}
		
		//We can create an arraylist of default size
		ArrayList<Integer> al2 = new ArrayList<>(20);
		
	}
}
/*
ArrayList will internally has array of 10 elements default size

when we keep on adding, it will increase size by 1.5 times 

*/