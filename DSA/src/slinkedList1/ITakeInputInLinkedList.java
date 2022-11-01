package slinkedList1;

import java.util.Scanner;

public class ITakeInputInLinkedList {

	public static void main(String[] args) {
		
		ENode<Integer> head = takeInput();
		printLL(head);
		
		ENode<Integer> head2 = takeInput2();
		printLL(head2);
	}
	
	public static void printLL(ENode n) {
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

	//Time  complexity is O(N^2)
	public static ENode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		ENode<Integer> head = null;
		
		while(data != -1) {
			ENode<Integer> currentNode = new ENode<>(data);
			if(head == null) {
				head = currentNode;
			}else {
				ENode<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	//optimising takeInput - time complexity is O(N)
	//in above code for inserting element after last node we are travelling each time
	//complete linked list, we can overcome this using a reference to tail as well
	
	public static ENode<Integer> takeInput2() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		ENode<Integer> head = null,tail=null;
		
		while(data != -1) {
			ENode<Integer> currentNode = new ENode<>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
//				ENode<Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
				tail.next = currentNode;
				tail = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
}
