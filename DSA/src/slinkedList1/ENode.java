package slinkedList1;

/*
 * Create a Node class
 */
public class ENode<T> {

	T data;
	ENode<T> next;
	
	ENode(T data){
		this.data = data;
		next = null;
	}
}
