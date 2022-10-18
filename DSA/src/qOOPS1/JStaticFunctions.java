package qOOPS1;

public class JStaticFunctions {

	static int numStudents;
	int rollNumber;
	
	public static int getNumStudents() {
//		System.out.println(rollNumber);- we cannot access a non static variable inside
//		a static method
		
//		this or super keyword cannot be used inside a static function
		return numStudents;
	}
	
	public static void main(String[] args) {
		//we can access static methods - ClassName.methodName
		JStaticFunctions.getNumStudents();
	}
}
