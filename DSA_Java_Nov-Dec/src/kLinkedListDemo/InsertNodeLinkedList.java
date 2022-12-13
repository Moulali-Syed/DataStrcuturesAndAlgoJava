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
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insertNode(Node<Integer> head,int elem,int pos) {
		Node<Integer> nodeToBeInserted = new Node<>(elem);
		if(pos==0) {
			nodeToBeInserted.next = head;
			return nodeToBeInserted;
		}else {
			int count = 0;
			Node<Integer> prev = head;
			while(count < pos-1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if(prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
		}
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> n = head;
		
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insertNode(head,80,2);
		printLL(head);
	}
}
