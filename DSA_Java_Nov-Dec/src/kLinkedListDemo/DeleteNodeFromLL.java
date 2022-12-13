package kLinkedListDemo;
//6
public class DeleteNodeFromLL {

	public static Node<Integer> deleteNode(Node<Integer> head,int pos){
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}
		int count = 0;
		Node<Integer> currNode = head;
		while(currNode != null && count < (pos-1)) {
			currNode  = currNode.next;
			count++;
		}
		if(currNode == null || currNode.next == null) {
			return head;
		}
		currNode.next = currNode.next.next;
		return head;
	}
	public static void main(String[] args) {
		
	}
}
