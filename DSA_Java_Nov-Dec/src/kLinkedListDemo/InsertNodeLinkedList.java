package kLinkedListDemo;

import java.util.Scanner;

//5
public class InsertNodeLinkedList {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode = new Node<>(data);
			if(head==null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
		}
		return head;
	}
	
	public static void insertNode(Node<Integer> head,int data,int position) {
		Node<Integer> n = head;
		Node<Integer> node = new Node<>(data);
		int count = -1;
		while(n!=null) {
			count++;
			if(count == position) {
				n.next = node;
				node.next = n.next;
			}
			n = n.next;
		}
		
	}
	public static void main(String[] args) {
		
	}
}
