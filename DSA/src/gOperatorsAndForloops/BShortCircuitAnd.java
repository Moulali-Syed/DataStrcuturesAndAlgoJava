package gOperatorsAndForloops;

public class BShortCircuitAnd {

	public static void main(String[] args) {
		
		int a =60,b=80;
		
		if(a++>60 && b++>80) {
			System.out.println("Inside if");
		}else {
			System.out.println("Inside else");
		}
		
		System.out.println("a "+a+" b "+b);//a 61 b 80
		
		/*
		 We are using short circuit and operator,which means if 1st condition
		 evaluates to false it will not check the further condition , because
		 it doesnot have any impact on result
		 
		 it will check 2nd condition only the first condition evaluates to true
		 */
	}
}
