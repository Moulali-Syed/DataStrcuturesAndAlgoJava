package slinkedList1;


class Node1{
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
	}
	
}
public class GCalculateLengthOfLinkedList {

	public static void calcLenOfLL(Node n) {
		int length = 0;
		while(n!=null) {
			length++;
			n=n.next;
		}
		System.out.println(length);
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(30);
		Node n3 = new Node(50);
		Node n4 = new Node(90);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		calcLenOfLL(n1);
	}
}
