package slinkedList1;
/*
 * 
 * make before break - make 20 point to 15 first then break the connection between 10 and 15
Say i have  a linked list
	2  8  10 15  25
	
	i want to insert 20 at position 3[say i]
	for this go to the i-1 node , from here we get next node also
	so connect i-1 node reference to newly inserted node and make new node
	point to next node
	
	
	also take care when inserting at position 0
 */
public class JInsertNodeInLinkedList {

	public static ENode<Integer> insert(ENode<Integer> head,int elem,int pos) {
		ENode<Integer> nodeToBeInserted = new ENode<Integer>(elem);
		
		if(pos == 0) {
			nodeToBeInserted.next = head;
//			head = nodeToBeInserted;
			return nodeToBeInserted;
		} else {

			int count = 0;
			ENode<Integer> prev = head;
			// prev != null , helps in checking when trying to insert at position greater
			// than length of linked list
			while (count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if (prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
			return head;
		}
	}
	
	public static void main(String[] args) {
		ENode<Integer> head = ITakeInputInLinkedList.takeInput2();
		head = insert(head,80,2);
		ITakeInputInLinkedList.printLL(head);
	}
}
