package qOOPS1;

public class FStudentUse {

	public static void main(String[] args) {
		FStudent st1 = new FStudent("Apple");
		st1.print();//0 Apple
		
		FStudent st2 = new FStudent(10,"Mango");
		st2.print();//10 Mango
		
		FStudent st3 = new FStudent();
		st3.print();//0 null
	}
	
	
}
