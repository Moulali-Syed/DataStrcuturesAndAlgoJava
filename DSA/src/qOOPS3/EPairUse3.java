package qOOPS3;

public class EPairUse3 {

	public static void main(String[] args) {
		EPair3<Integer,String> p = new EPair3<Integer,String>(1,"Delhi");
		p.setFirst(10);
		System.out.println(p.getFirst());
		
		EPair3<String,String> p1 = new EPair3<String,String>("Happy","City");
		p1.setFirst("Apple");
		System.out.println(p1.getFirst());
		
		//say now i want to pass a pair of integer as a first argument and integer as
		//second argument
		int a = 12;
		int b = 15;
		int c = 19;
		EPair3<Integer,Integer> internalPair = new EPair3<>(a,b);
		EPair3<EPair3<Integer,Integer>,Integer> p2 = new EPair3<>(internalPair,19);
		
		System.out.println(p2.getSecond());
		System.out.println(p2.getFirst().getFirst());
		System.out.println(p2.getFirst().getSecond());
		
	}
}
