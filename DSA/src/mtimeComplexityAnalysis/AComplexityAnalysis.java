package mtimeComplexityAnalysis;
/*
Time required for an algorithm for an input of size n

Space required by an algorithm for an input of size n
 */
public class AComplexityAnalysis {

}
/*
Number of operations for input size n

say i have a for loop
		ans = 1; //here happens 1 operation
		for(int i (1:n))	//here happens n operations
			ans = ans*i		//here happens n operations
			
		return ans//here happens 1 operation
		
		
Whats important to us is the structure how it is looking

for a given n input size we have constant operations n proportional to n
	2+2n
	k+kn
	
	what depends is how the operations going on for a given input size n
		is it proportional [n]
			  square [n^2]

*/