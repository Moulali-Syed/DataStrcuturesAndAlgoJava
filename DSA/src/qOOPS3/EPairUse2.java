package qOOPS3;

public class EPairUse2 {

	public static void main(String[] args) {
		EPair2<String> p = new EPair2<String>("Capital","Delhi");
		p.setFirst("Happy");
		p.setSecond("City");
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
		
		EPair2 p1 = new EPair2(1,2);//By default it considers T as Object
		
		//we must use object type ,not int which is a primitive type
		EPair2<Integer> p2 = new EPair2<Integer>(1,2);
		
		//its optional to specify reference ,after the new ClassName<>
		EPair2<Character> p3 =  new EPair2<>('c','a');
		
	}
}
