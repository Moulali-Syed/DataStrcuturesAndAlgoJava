package qOOPS3;

public class EPair3<T,V> {

	private T first;
	private V second;
	
	public EPair3(T first,V second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public V getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setSecond(V second) {
		this.second  = second;
	}
}
