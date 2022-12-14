package hfunctionsAndScope;

public class DFunctions {

	public static int divide(int n1,int n2) {
		if(n2==0) {
			return Integer.MIN_VALUE;
		}
		return n1/n2;
	}
	public static void divideNumbers(int num,int deno) {
		if(deno==0) {
			return;//after return nothing will get executed
		}
		System.out.println(num/deno);
	}
	public static void main(String[] args) {
		int res = divide(10,2);
		System.out.println(res);
		divideNumbers(10,2);
	}
}
