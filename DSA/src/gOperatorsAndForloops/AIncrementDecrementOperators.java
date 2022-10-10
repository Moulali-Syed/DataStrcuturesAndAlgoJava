package gOperatorsAndForloops;

public class AIncrementDecrementOperators {

	public static void main(String[] args) {
		int a  = 60;
		
		//we have post and pre increment, decrement operators
		//post increment
		System.out.println(a++);//60
		System.out.println(a);//61
		
		//pre increment
		int b = 60;
		System.out.println(++b);//61
		
		//post decrement
		int c = 60;
		System.out.println(c--);//60
		System.out.println(c);//59
		
		//pre decrement
		int d = 60;
		System.out.println(--d);//59
	}
}
