package nRecursion;
/*
Recursion:is a function calling itself
Recursion in computer science is a method where the solution to a problem 
depends on solution to smaller instances of the same problem

n! = n*(n-1)*(n-2)*(n-3)*....
n! = n*(n-1)!
 */

/*
Basecase - what is the simplest problem i have to solve[where i have to stop]
 */
public class ARecursion {
	
	public static int fact(int n) {
		
		//step1 - basecase
		if(n==0) {
			return 1;
		}
		int smallAns = fact(n-1);
		return n*smallAns;
	}
	
	public static void main(String[] args) {
		int res = fact(4);
		System.out.println(res);
	}

}
