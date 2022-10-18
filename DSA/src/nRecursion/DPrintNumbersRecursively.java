package nRecursion;

/*
Print Numbers

Given is the code to print numbers from 1 to n in increasing order recursively. But it contains few bugs that you need to rectify such that all the test cases pass.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
 */
public class DPrintNumbersRecursively {

		public static void printRecursive(int n) {
			if(n==1) {
				System.out.print(n+" ");
				return;
			}
			
			printRecursive(n-1);
			System.out.print(n+" ");
			
		}
		/*
		 1.  1==3 no , goto line30 - pr(3-1)
		 2.  1==2 no , goto line 30 - pr(1)
		 3.  1==1 yes, print 1
		 this 1 will get returned to n=2 iteration and continues
		 */
		public static void main(String[] args) {
			printRecursive(3);
		}
	
}
