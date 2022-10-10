package hfunctionsAndScope;

public class IUpdatingTheValue {

	public static int increment(int n) {
		n++;
		return n;
	}
	
	public static void main(String[] args) {
		int n = 10;
		n = increment(n);
		System.out.println(n);//11
	}
}
/*
The only way a caller can pass value to callee , is thru arguments
The only way a callee can pass value to caller is by return
*/