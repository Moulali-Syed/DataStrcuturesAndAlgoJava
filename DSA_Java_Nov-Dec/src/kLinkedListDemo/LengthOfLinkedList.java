package kLinkedListDemo;

import java.util.Scanner;
//3
public class LengthOfLinkedList {

	public static Node<Integer> lengthOfLinkedList() {
		Node<Integer> head= null;
		Node<Integer> tail= null;
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	public static void findLength(Node<Integer> head) {
		int count = 0;
		Node<Integer> n = head;
		while(n!=null) {
			count+=1;
			n = n.next;
		}
		System.out.println(count);
	}
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	public static void main(String[] args) {
		Node<Integer> head = lengthOfLinkedList();
//		Node<Integer> head = createLinkedList();
		findLength(head);
	}
}
