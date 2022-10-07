package aFlowCharts;

import java.util.Scanner;

/*
 * If it is raining outside  i will carry an umbrella
 * if not raining will not carry an umbrella
 */
public class CDecisonMakingFlowChart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1>= n2) {
			if (n1 >= n3) {
				System.out.println("n1 is greater" + n1);
			}

		} else if (n2 >= n3) {
			System.out.println("n2 is greater " + n2);
		} else {
			System.out.println("n3 is greater " + n3);
		}

	}
}

/*
 * Decison making box - rhombus
 * 
 * Find given number is even or odd?
 * 
 * Start
 *  Read Number A 
 *  Calculate res = A%2 
 *  Check res == 0 
 *  if True EVEN 
 *  else Odd
 * Print Even/Odd End
 */

/*
 * Find Largest of Three Numbers
 * 
 * Start Read A,B,C 
 * Check A>B && A>C - A is greater
 *  Else if Check B>C - B is
 * greater 
 * else C is greater 
 * output greater number End
 */

/*
Check Number is positive or negative

Start
Read Number A
Check A>0 - res = 1
Check A<0 - res = -1
Else res = 0
Output res
End
*/

/*
Valid triangle

Start
Read a,b,c
check a+b > c 
if true triangle can be formed
else triangle cannot be formed
End
*/