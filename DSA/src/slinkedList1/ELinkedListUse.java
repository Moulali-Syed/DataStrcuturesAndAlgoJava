package slinkedList1;

public class ELinkedListUse {
	
	//creation of linked list
	public static ENode<Integer> createLinkedList(){
		ENode<Integer> n1 = new ENode<>(10);
		ENode<Integer> n2 = new ENode<>(20);
		ENode<Integer> n3 = new ENode<>(30);
		ENode<Integer> n4 = new ENode<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.println("n1 "+n1 +" data "+n1.data+" next "+n1.next);
		System.out.println("n2 "+n2 +" data "+n2.data+" next "+n2.next);
		System.out.println("n3 "+n3 +" data "+n3.data+" next "+n3.next);
		System.out.println("n4 "+n4 +" data "+n4.data+" next "+n4.next);
		return n1;
		
	}
	
	/*
n1 slinkedList1.ENode@5e265ba4 data 10 next slinkedList1.ENode@156643d4
n2 slinkedList1.ENode@156643d4 data 20 next slinkedList1.ENode@123a439b
n3 slinkedList1.ENode@123a439b data 30 next slinkedList1.ENode@7de26db8
n4 slinkedList1.ENode@7de26db8 data 40 next null
	 */

	//print elements in a linked list
	public static void print(ENode head) {
		System.out.println(head.data);
		System.out.println(head.next);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.data);
	}
	/*
10
slinkedList1.ENode@156643d4
20
30
40
	 */
	
	public static void printLL2(ENode head) {
		ENode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		ENode<Integer> n1 = new ENode<>(10);
		System.out.println(n1);//slinkedList1.ENode@626b2d4a
		System.out.println(n1.data);//10
		System.out.println(n1.next);//null
		
		ENode<Integer> head = createLinkedList();
		print(head);
		
		printLL2(head);
		
	}
}
