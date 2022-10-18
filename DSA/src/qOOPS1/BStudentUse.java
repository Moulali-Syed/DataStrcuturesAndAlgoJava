package qOOPS1;

public class BStudentUse {
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		For now we have mostly seen the Scanner, it is a class
//		lets follow the same for creating object for BStudent class
		BStudent st1 = new BStudent();
		st1.name = "Apple";
		st1.rollNumber  = 1;
		
		BStudent st2 = new BStudent();//creates object
		
		//new BStudent()---> this creates an object
		
		System.out.println(st1);//qOOPS1.BStudent@626b2d4a
		//on printing object we get package.className@address
		//st1 and st2 are stored in heap memory
		
		//we can access and see their default values
		System.out.println(st2.name);//null - because string is non primitive
		System.out.println(st2.rollNumber);//0
		
		//we can set values
		st2.name = "Happy";
		st2.rollNumber = 2;
		System.out.println(st2.name+" "+st2.rollNumber);//Happy 2
		
	}
}
