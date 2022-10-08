package dRelationalLogicalOperators;

public class ETrickyConditional {

	public static void main(String[] args) {
		
		int a = 20;
		int b =30;
		if((a=1)==b) {
			System.out.println(a+b);
		}else {
			System.out.println(a);
		}
	}
}
//output: 1