package qOOPS1;

public class KFractionExampleUse {

	public static void main(String[] args) {
		KFractionExample f1 = new KFractionExample(4,6);
		f1.print(); 
//		f1.setNumerator(12);
		f1.getNumerator();
		f1.increment();
		f1.print();
		
		KFractionExample f2 = new KFractionExample(4,8);
		KFractionExample.add(f1,f2);
		
		f1.add(f2);
		f1.print();
		
		KFractionExample f3 = KFractionExample.add(f1, f2);
		f3.print();
		
		/*
		 2/3 +1/2  =  2*2+3*1/3*2  =  deno2*nume1+deno1*nume2/deno1*deno2 
	
		 */
	}
}
