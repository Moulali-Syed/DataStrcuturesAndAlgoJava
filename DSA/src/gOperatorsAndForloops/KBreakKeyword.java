package gOperatorsAndForloops;

public class KBreakKeyword {

	public static void main(String[] args) {
		int n = 5;
		int i =1;
		while(i<=n) {
			if(i==4) {
				break; //will come out of loop
				//anything after break is unreachable code
				//System.out.println("hello");//Unreachable code
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Outside While loop");
		
		for(int j=1;j<=5;j++) {
			if(j==4) {
				break;
			}
			System.out.println(j);
		}
		System.out.println("outside for loop");
	}
}

//return will exits the method
//break will come out of immediate loop
//continue skips current iteration
