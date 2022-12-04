package bGettingstartedWithJava;

public class ECheckUnIntializedLocalVariable {

	 int a;
	
	public void sayHi() {
		String b;
		System.out.println(a);//0
//		System.out.println(b);//The local variable b may not have been initialized
	}
	public static void main(String[] args) {
		int c;
//		System.out.println(c);//The local variable c may not have been initialized
		
//		System.out.println(a);//Cannot make a static reference to the non-static field a
	
		ECheckUnIntializedLocalVariable obj = new ECheckUnIntializedLocalVariable();
		System.out.println(obj.a);
	
	}
}

/*
Instance variable has a default value

Local variable doesnot have any initial value by default
*/