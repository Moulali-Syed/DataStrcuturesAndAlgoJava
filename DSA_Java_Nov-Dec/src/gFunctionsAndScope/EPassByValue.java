package gFunctionsAndScope;

public class EPassByValue {

	public static void a(int n) {
		b(n);
		System.out.println("Inside a "+n);//10
		n++;
	}
	
	public static void b(int n) {
		c(n);
		System.out.println("Inside b "+n);//10
		n++;
	}
	
	public static void c(int n) {
		System.out.println("Inside c "+n);//10 - 1
		n++;
	}
	public static void main(String[] args) {
		int n = 10;
		a(n);
		System.out.println("Inside Main "+n);//10
	}
}
