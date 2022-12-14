package mtimeComplexityAnalysis;

public class CIterativeNonLinearBigO {

}
/*
Bubble sort - BigO(n^2)

say i have some code
	i=0
	while(i<=n)
		a = some operation that takes n times
		say i have bubble sort - which takes o(n^2)
		i=i+1
		
sigma i=1 to n ---ki+ki^2 - for each itertaion we are doing , so for n iterations it will 
be O(n^3)

* if i have a loop of n , then a loop of n^2 operations inside it
* then it means for each i value it runs i^2 times , and for n iterations
* it is sum of each iteration , so bigO(n^3)
* 

merging two sorted arrays of size n and m = BigO(n+m)

Linear Search - O(n)
Bubble Sort - O(n^2)
Binary Search - O(logn)
		
*/