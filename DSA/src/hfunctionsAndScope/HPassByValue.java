package hfunctionsAndScope;

public class HPassByValue {

	public static void increment(int n) {
		n++;
		System.out.println(n);//11
	}

	public static void main(String[] args) {
		int n = 10;
		increment(n);
		System.out.println(n);//10
		
		//we have only pass by value in java, no pass by reference
	}

}
