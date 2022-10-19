package qOOPS1;

public class LDynamicArrayUse {

	public static void main(String[] args) {
		LDynamicArrayClass d = new LDynamicArrayClass();
		
		//add - add element at end
		for(int i=1;i<100;i++) {
			d.add(100+i);
		}
		
		System.out.println(d.size());//gives length
		
		System.out.println(d.get(2));//get element at index position
		
		d.set(3,120);//sets an element at desired index position
		
		System.out.println(d.get(3));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("size - "+d.size());
		}
		
		
	}
}
