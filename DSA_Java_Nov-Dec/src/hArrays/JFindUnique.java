package hArrays;
/*
Find Unique

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
 Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the 
array/list.

Second line contains 'N' single space separated integers representing the elements in the 
array/list.
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
 */
public class JFindUnique {

	/*
	 //prints all unique elements from array 
	public static void findUnique(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean isUnique = false;
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					isUnique = true;
				}
			}
			if(!isUnique) {
				System.out.println(arr[i]);
			}
		}
	}
	*/
	
	/*
	 we can use xor - to find the unique element that occurs only once
	 xor - satisfies 
	 	commutative law
	 	this law says we can swap numbers and still get the same result
	 	a+b = b+a  |  a*b = b*a
	 	
	 	Associative law
	 		no matter how we form group
	 			(a+b)+c = a+(b+c);
	 			
	 	0^0 - 0
	 	0^1 - 1
	 	1^0 - 1
	 	1^1 - 0
	 */
	
	public static void findUnique(int[] arr) {
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			res ^= arr[i];
		}
		System.out.println(res);
	}
	
	public static int findUnique2(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=0;j<arr.length ;j++) {
				if(i!=j) {
					if(arr[i] == arr[j]) {
						break;
					}
				}
			}
			
			if(j==arr.length) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		int[] arr = {2 ,3, 1, 6, 3, 6, 2};
//		findUnique(arr);
		
		int uniqueEle = findUnique2(arr);
		System.out.println(uniqueEle);
	}
}
