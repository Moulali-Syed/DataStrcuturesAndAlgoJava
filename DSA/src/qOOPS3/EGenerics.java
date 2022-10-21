package qOOPS3;
/*
 I want to create a class EPair,it has 2 private instance variables 
 private int first and private int second, then i have a constructor and getter
 setter
 
 package qOOPS3;

public class EPair {

	private int first;
	private int second;
	
	public EPair(int first,int second) {
		this.first = first;
		this.second = second;
	}
	
	public int getFirst() {
		return first;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setFirst(int first) {
		this.first = first;
	}
	
	public void setSecond(int second) {
		this.second  = second;
	}
}


package qOOPS3;

public class EPairUse {

	public static void main(String[] args) {
		EPair p = new EPair(1,2);
		p.setFirst(10);
		System.out.println(p.getFirst()); 
		System.out.println(p.getSecond());
	}
}

Now i can create pair of 2 integers

But Now i want to store 2 Strings , for that i have to create one other class 
with String data type variables, constructor accepts String values
We will make exact copy of same class and replace int with String everywhere
Which is a lot of repetitions of code

Generics helps to overcome this, we use T instead of giving datatype
actual object gets created when we use new keyword, give <T> after className
our generic is created

package qOOPS3;

public class EPair2<T> {

	private T first;
	private T second;
	
	public EPair2(T first,T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setSecond(T second) {
		this.second  = second;
	}
}


package qOOPS3;

public class EPairUse2 {

	public static void main(String[] args) {
		EPair2<String> p = new EPair2<String>("Capital","Delhi");
		p.setFirst("Happy");
		p.setSecond("City");
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		EPair2 p1 = new EPair2(1,2);//By default it considers T as Object,which is problematic
		//never use it
		
		//we must use object type ,not int which is a primitive type
		EPair2<Integer> p2 = new EPair2<Integer>(1,2);
		
		//its optional to specify reference ,after the new ClassName<>
		EPair2<Character> p3 =  new EPair2<>('c','a');
	}
}


Now my requirement is the variable first to be integer and second to be a String

package qOOPS3;

public class EPair3<T,V> {

	private T first;
	private V second;
	
	public EPair3(T first,V second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public V getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setSecond(V second) {
		this.second  = second;
	}
}


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

 */
public class EGenerics {

}
