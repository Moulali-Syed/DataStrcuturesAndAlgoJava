package qOOPS1;

public class HFinalKeyword {

//	I want to give value only once and not want to change it any further - then 
//	mark it final
	
	final double conversionFactor = 0.97;
	
	//we can no more  change value of a final variable
	
//	Say I want to make rollNumber final , its value must be initialized at time
//	of declaration or within constructor
	final int rollNumber;
	public HFinalKeyword(int rNo){
		this.rollNumber = rNo;
	}
}
