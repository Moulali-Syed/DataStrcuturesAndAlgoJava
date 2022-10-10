package gOperatorsAndForloops;

public class LContinueKeyword {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			if(i==3) {
				continue;//skips current iteration
//				System.out.println("hi");[Unreachable code]
			}
			System.out.println(i);
		}
	}
}
