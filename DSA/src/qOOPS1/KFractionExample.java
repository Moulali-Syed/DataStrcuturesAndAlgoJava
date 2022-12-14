package qOOPS1;

public class KFractionExample {

	private int numerator;
	private int denominator;

	public KFractionExample(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	private void simplify() {
//		int range = numerator<denominator ? numerator:denominator;
		int range = Math.min(numerator, denominator);
		int gcd = 1;
		for(int i=2;i<=range;i++) {
			if(numerator%i ==0 && denominator%i==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}

	public int getNumerator() {
		return this.numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}
	
	public void setDenominator(int denominator) {
		if(denominator==0) {
			denominator =1;
		}
		this.denominator = denominator;
	}

	public void print() {
		System.out.println(this.numerator+"/"+ this.denominator);
	}
	
	public static KFractionExample add(KFractionExample fr1,KFractionExample fr2) {
		int nume1 = fr1.getNumerator();
		int nume2 = fr2.getNumerator();
		int deno1 = fr1.getDenominator();
		int deno2 = fr2.getDenominator();
		
		int resNume = ((deno2*nume1)+(deno1*nume2));
		int resDeno = (deno1*deno2);
		System.out.println(resNume+"/"+resDeno);
		
		KFractionExample f3 = new KFractionExample(resNume,resDeno);
		return f3;
	}
	
	public void add(KFractionExample f2) {
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
}
