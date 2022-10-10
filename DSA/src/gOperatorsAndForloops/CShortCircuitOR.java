package gOperatorsAndForloops;

public class CShortCircuitOR {

	public static void main(String[] args) {
		int a = 60,b=80;
		if(a++>60 || b++>80) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		
		System.out.println("a "+a+" b "+b);//61 and 81
		
		int c = 30 , d = 40;
		if(31>c || d++>40) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		System.out.println("c "+c+" d "+d);//c 30 d 40
		/*
		 shortcircuit or once 1st condition is evaluates to true , its will not
		 check 2nd condition
		 */
	}
}
