package qOOPS1;

public class EStudent {

	private int rollNumber;
	
	public void setRollNumber(int rollNumber) {
//		rollNumber = rollNumber;//this will confuses and will not work
		//to differentiate between the instance and local variable we can use this keyword
		System.out.println("the value of this "+this);
//		the value of this qOOPS1.EStudent@626b2d4a
		this.rollNumber = rollNumber;
	}
	
	public int getRollNumber() {
		return this.rollNumber; 
	}
}
