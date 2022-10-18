package qOOPS1;

public class DStudent {

	private int rollNumber;
	public String name;
	
	
	//A getter method for a private varibale
	public int getRollNumber() {
		return rollNumber;
	}
	
	//to set a value we can use setter method
	public void setRollNumber(int rollNum) {
		//We can have restrictions here
		//What value can be set and what not be
		if(rollNum<=0) {
			return;
		}
		this.rollNumber = rollNum;
	}
}
