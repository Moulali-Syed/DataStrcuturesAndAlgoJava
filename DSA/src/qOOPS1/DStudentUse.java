package qOOPS1;

public class DStudentUse {

	public static void main(String[] args) {
		DStudent st1 = new DStudent();
		
		System.out.println(st1.name+" "+st1.getRollNumber());
		
		st1.setRollNumber(12);
		st1.name = "Apple";
		System.out.println(st1.getRollNumber()+" "+st1.name);
	}
}
