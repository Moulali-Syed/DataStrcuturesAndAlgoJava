package nRecursion;

public class FibonacciNumber {
//base case and small problem solution
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(fib(n));
	}
}
