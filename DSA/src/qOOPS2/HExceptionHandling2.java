package qOOPS2;

public class HExceptionHandling2 {

	
	public static int divide(int a , int b) throws HDivideByZeroException {
		if(b==0) {
			throw new HDivideByZeroException();
			
//			throw new ArithmeticException();//we can use throw keyword to throw an exception
		}
		return a/b;
	}
	public static void main(String[] args)  {
		String s = null;
//		System.out.println(s.length());//java.lang.NullPointerException: 
		
		/*
		 Exception is something which ends our code abruptly
		 
		 we have 	Exceptions
		 			/	|	\
		 		errors  |	Checked Exception
		 			 unchecked Exception
		 		
		 */
		try {
			
			divide(10,0);
		}catch(HDivideByZeroException e) {
			System.out.println("Divide by Zero Exception");
//			e.printStackTrace();
		}
		System.out.println("Main");
	}
}
/*
To create user defined exception , we can create a class and change its parent class
from Object to Exception
*/