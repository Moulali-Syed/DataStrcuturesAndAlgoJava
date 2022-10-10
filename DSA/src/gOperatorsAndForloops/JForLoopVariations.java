package gOperatorsAndForloops;

public class JForLoopVariations {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1,j=100;i<=n && j<=170 ;i++,j+=20) {
			System.out.println(i+" "+j);
		}
		
		//nested loop will work similar to while loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
			}
		}
	}
}

//in initialization we can have comma
//in loop step we can have comma
//in condition we must either use && or ||, not comma