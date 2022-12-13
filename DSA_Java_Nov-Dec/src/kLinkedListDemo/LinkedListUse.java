package kLinkedListDemo;
//2
public class LinkedListUse {
	
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

	public static void printLL(Node<Integer> head) {
		
		/*
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.data);
		
		 
		 */
		Node<Integer> n = head;
		
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void incrementLL(Node<Integer> head) {
		Node<Integer> n = head;
		while(n!=null) {
			n.data+=1;
			n = n.next;
		}
		
	}
	public static void main(String[] args) {
		/*
		Node<Integer> n1 = new Node<>(10);
		System.out.println(n1.data);
		System.out.println(n1.next);
		*/
		Node<Integer> head = createLinkedList();
		printLL(head);
		incrementLL(head);
		printLL(head);
		
	}
}
