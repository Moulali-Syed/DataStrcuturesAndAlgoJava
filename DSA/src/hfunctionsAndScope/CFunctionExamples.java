package hfunctionsAndScope;

public class CFunctionExamples {

	public static int sum(int a ,int b) {
		return a+b;
	}
	
	public static void evenNums(int n) {
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int sum = sum(2,3);
		System.out.println(sum);
		evenNums(100);
	}
}
