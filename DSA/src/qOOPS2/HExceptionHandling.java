package qOOPS2;

public class HExceptionHandling {

	
	public static int divide(int a , int b) throws HDivideByZeroException {
		if(b==0) {
			throw new HDivideByZeroException();
			
//			throw new ArithmeticException();//we can use throw keyword to throw an exception
		}
		return a/b;
	}
	public static void main(String[] args) throws HDivideByZeroException {
		String s = null;
//		System.out.println(s.length());//java.lang.NullPointerException: 
		
		/*
		 Exception is something which ends our code abruptly
		 
		 we have 	Exceptions
		 			/	|	\
		 		errors  |	Checked Exception
		 			 unchecked Exception
		 		
		 */
		
		divide(10,0);
	}
}
/*
To create user defined exception , we can create a class and change its parent class
from Object to Exception
*/