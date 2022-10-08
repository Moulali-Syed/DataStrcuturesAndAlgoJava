package dRelationalLogicalOperators;

public class BLogicalOperator {

	public static void main(String[] args) {
		
		//AND , OR , NOT
		
		//AND - && - both true then true
		System.out.println((2>3)&&(10>5));//false
		
		//OR - || - only false when both are false
		System.out.println((2>3)||(10>5));//true
		
		//NOT
		System.out.println(!(2>3));//true
	}
}
