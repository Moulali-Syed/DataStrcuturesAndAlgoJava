package qOOPS1;

public class IStudent {

	int rollNumber;
	String name;
	int numStudents;
	static int numStuds;
//	we can specify a variable static and final
	final static double CONVERSIONFACTOR  = 0.95;
	
	IStudent(int rno,String name){
		this.rollNumber = rno;
		this.name = name;
		numStudents++;
		numStuds++;
	}
	
	IStudent(String name){
		
		this.name = name;
		numStudents++;
		numStuds++;
		this.rollNumber = numStuds;
	}
	
	public static void main(String[] args) {
		IStudent st1= new IStudent(1,"Apple");
		IStudent st2 = new IStudent(2,"Banana");
		IStudent st3 = new IStudent(3,"JackFruit");
		
		System.out.println(st1.numStudents+" "+st2.numStudents+" "+st3.numStudents);
		//what i need is the totalStudents count, this way we cannot get it so we use static
		//which makes it class specific instead of object specific
		
		//static shared by all objects , belong to class and not to object
		System.out.println(st1.numStuds+" "+st2.numStuds+" "+st3.numStuds);
		
		//correct way to access static varibles is className.statiVariableName
		System.out.println(IStudent.numStuds);
	}
}
