package nRecursion;

public class BSumOfNaturalNumbers {

	public static int sumOfNums(int n) {
		
		if(n==1) {  //base case
			return 1;
		}
		return n+(sumOfNums(n-1));
		
	}
	
	public static void main(String[] args) {
		int res = sumOfNums(4);
		System.out.println(res);
	}
}
