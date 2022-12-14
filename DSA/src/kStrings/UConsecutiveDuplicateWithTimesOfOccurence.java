package kStrings;
/*
Compress the String

Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note :
Consecutive count of every character in the input string is less than or equal to 9.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
 */
public class UConsecutiveDuplicateWithTimesOfOccurence {

	public static String consecDuplicates(String str) {
		String st = ""+str.charAt(0);//consider a new  String, store first Character
		int num = 1;
		for(int i=1;i<str.length();i++) {//iterate over string from 1 to end
			if(str.charAt(i)==st.charAt(st.length()-1)) {//check char at i in st equal to char at str.length-1
				num++;//if equal increment count
			}else {
				String times  = (num)>1?String.valueOf(num):"";//check if num is >1 or ==1
				st+=times;//add it to st
				num=1;//reassign num to 1
				st+=str.charAt(i);//add the next char from str to st
			}
		}
		String time = num>1?String.valueOf(num):"";
		return st+time;//return st+num
	}
	
	public static void main(String[] args) {
		String s = consecDuplicates("a3b2c2dsaaaaaa");
		System.out.println(s);
	}
}
