package mtimeComplexityAnalysis;

public class BBigONotationIterativeLinear {

}
/*
say we have k+kn+kn^2+klogn

	we worry about for an input  n , which is highest operations happening
	as n increases - k1 doesnot 
	   n increases - kn increases
	   n increases = kn^2 increases rapidly
	   
	kn+kn^2+kn^3+kn^2logn
	we can say time complexity is n^3 - because rest are less compared to n^3
	
	An algorithm A - is said to BigO of n^2 if take taken by algorithm for input size 
	n is less than equal to some constant kn^2
	A --> BigO(n^2) if T(A,n) <= kn^2
	It is the maximum time that algorithm will take , not morethan that

*/