package qOOPS1;

public class LDynamicArrayClass {

	
	//With array we cannot increase its size dynamically
	
	//Dynamic array will increase its size
	
	/*
	 Dynamic array will internally maintains array
	 if array is full , then dynamic array will double its capacity
	 we create a new array of double size and copy the elements from previous array
	 */
	private int data[];
	private int nextElementIndex;
	LDynamicArrayClass(){
		data = new int[5];
		nextElementIndex = 0;
	}
	
	//say i have an array of size 5 created,but actual elements inserted in it is 3
	//thus we must return the nextElementIndex which indicates the actual size
	public int size() {
		return nextElementIndex;
	}
	
	//to check if array is empty, see if nextElementIndex is 0
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	//to get element at particular index
	public int get(int i) {
		if(i>=nextElementIndex) {
			return -1;//we can throw error
		}
		return data[i];
	}
	public void set(int i,int elem) {
		if(i>=nextElementIndex) {
			return;
		}
		data[i] = elem;
	}
	public void add(int elem) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = elem;
		nextElementIndex++;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	
	public int removeLast() {
		if(nextElementIndex==0) {
			return -1;
		}
		int temp = data[nextElementIndex-1];
		data[nextElementIndex-1] = 0;
		nextElementIndex--;
		return temp;
	}
}
