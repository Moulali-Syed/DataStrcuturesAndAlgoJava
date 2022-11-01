package slinkedList1;

 class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

public class FIncrementEveryElementInLinkedList {
	
	public static void printLL(Node n) {
		while(n!=null) {
			System.out.print(n.data+" ");
			n= n.next;
		}
	}
	
	public static void incrementLL(Node n) {
		while(n!=null) {
			n.data = ++n.data;
			n= n.next;
		}
	}
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		n1.next = n2;
		n2.next = n3;
		
		printLL(n1);
		incrementLL(n1);
		printLL(n1);
		
	}
}
