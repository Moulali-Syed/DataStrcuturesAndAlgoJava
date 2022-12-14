package dRelationalLogicalOperators;

import java.util.Scanner;

/*
 Total Salary

Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
 totalSalary = basic + hra + da + allow ? pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ?A?
allow = 1500 if grade = ?B?
allow = 1300 if grade = ?C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
Input format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary
Constraints :
0 <= Basic Salary <= 7,500,000
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
 */
public class QTotalSalaryCalcAssignment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basicSal = s.nextInt();
		char grade = s.next().charAt(0);
		
		double hra = (20.0/100)*basicSal;
//		System.out.println(hra);
		double da = (50.0/100)*basicSal;
//		System.out.println(da);
		int allow;
		if(grade=='A') {
			allow = 1700;
		}else if(grade == 'B') {
			allow = 1500;
		}else {
			allow = 1300;
		}
		
		double pf = (11.0/100)*basicSal;
//		System.out.println(pf);
		
		int totalSal = (int) Math.round(( basicSal+ hra + da + allow ) - pf);
		System.out.println(totalSal);
	}
}
