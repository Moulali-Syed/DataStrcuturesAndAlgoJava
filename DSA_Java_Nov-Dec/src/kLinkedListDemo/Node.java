package kLinkedListDemo;
//1
public class Node<T> {

	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
//		next= null [by default reference data type has null , so need not specify
	}
}
