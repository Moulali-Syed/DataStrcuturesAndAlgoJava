package qOOPS3;

public class EPairUse {

	public static void main(String[] args) {
		EPair p = new EPair(1,2);
		p.setFirst(10);
		System.out.println(p.getFirst()); 
		System.out.println(p.getSecond());
	}
}
