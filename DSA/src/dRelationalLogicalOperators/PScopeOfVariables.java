package dRelationalLogicalOperators;

public class PScopeOfVariables {

	public static void main(String[] args) {
		//area of code that i can access a variable
		
		int i = 10;
		//i can be accessed in the main method only
		//we can have duplicate varibaleNames in same method
		//changing datatypes doesnot help, however name cannot be same
		
		int a=10;
		if(a>5) {
			int b=20;
		}else {
			int b =100;
		}
//		System.out.println(b);//scope of b is upto the if block
		//figure out the scope by its ending curly braces }
		
		//scope of b - in if and else is different
	}
}
