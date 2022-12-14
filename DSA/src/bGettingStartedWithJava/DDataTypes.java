package bGettingStartedWithJava;

public class DDataTypes {

	public static void main(String[] args) {
		
		//Integer numbers
		byte a = 10;
		short b = 100;
		int c = 9293;
		long d = 9213993l;
		
		//Decimal numbers
		float e = 928.23f;
		double f = 1213.23312;//default , we can store more precision
		
		//store characters
		char g = 'A';
		
		//boolean
		boolean isValid = true;//can have true or false values
	}
}

/*
 * 
 * Local variables cannot be used before initialization
 * that is variables inside methods , they dont have initial value
 * 
 * but variables that are instance they have initial value
 * 
 * variable names cannot start with number
 * In java we follow Camel case - isValid
 * 
 * We have InputMismatchException - when data we read from Scanner is 
 * different from where we are storing
*/