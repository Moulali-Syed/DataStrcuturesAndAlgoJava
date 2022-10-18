package mtimeComplexityAnalysis;
/*
Duplicate in array

You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
 */
/*

2 1 0 4 3 1  ---- is array 
approach1:
take 1st element and check the rest of n-1 elements , 
take 2nd element and check rest of n-2 elements,
and so on ..
so this leads to (n-1)+(n-2)+(n-3)+.....1
n(n-1)/2
O(n^2)

approach2:
sort the complete array
check the elements side by side

sorting - nlogn
itertaing once - O(n)
nlogn+O(n) = nlongn

approach3:
find sum of all elements in array [2+1+0+4+3+1 = 11]
As we know array elements are from 0 to n-2
find sum of sum n-2 elements
(n-2)(n-1)/2 [4*5/2 = 10]

subtract = 11-10
 */
public class GFindDuplicate {

	public static int findDuplicate(int[] arr) {
		int sum1 = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			sum1+=arr[i];
		}
		int sum2=((n-2)*(n-1))/2;
		int ele = sum1-sum2;
		return ele;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,0,4,3,1};
		int ele = findDuplicate(arr);
		System.out.println(ele);
	}
}
