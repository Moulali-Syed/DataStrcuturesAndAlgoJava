package gOperatorsAndForloops;

public class HForLoop {

	public static void main(String[] args) {
		//initialization
		//condition
		//increment or decrement[loop step]
		
		int n = 5;
		int i = 1;//1.initialization
		while(i<=n) { //2.condition
			System.out.println(i);
			i++;//3.increment or decrement
		}
		
		//same in for loop
		for(int p=1;p<=n;p++) {
			System.out.println(p);
		}
		
		//different ways we can write for loop
		//if we want the scope of loop variable outside then use below
		int q=1;
		for(;q<=n;q++) {
			System.out.println(q);
		}
		
		//if we skip the increment step, it results in infinite loop
		int r=1;
		for(;r<=n;) {
			System.out.println(r);
		}//infinite loop because r is not changing
		
		for(;r<=n;) {
			System.out.println(r);
			r++;//u can also specify increment step here
		}
		
		for(;;r++) {
			System.out.println(r);
		}//condition is also optional, this results in infinite loop
	}
}
