package qOOPS1;

public class GConstructorExample {
	int a;
	int b;
	
	public GConstructorExample() {
		this(10,20);
		System.out.println("inside constructor 1 - Non Parameterized");
	}
	
	public GConstructorExample(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println("inside constructor 2 - Paramterized");
	}
	
	public static void main(String[] args) {
		GConstructorExample obj = new GConstructorExample();
		//When object is created non paramterized constructor is called
		//When this(10,20) is encountered the constructor with 2 arguments int and int 
		//is called because this is the reference of the object
		//using this way we can call more than one constructor
	}
}
