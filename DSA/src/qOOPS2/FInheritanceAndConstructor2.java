package qOOPS2;


class FA1{
	int maxSpeed;
	FA1(int maxSpeed){
		this.maxSpeed = maxSpeed;
		System.out.println("FA Constructor"+" "+ this.maxSpeed);
	}
}

class FB1 extends FA1{
	
	FB1(int maxSpeed){
		super(maxSpeed);
		System.out.println("FB Constructor");
	}
	
}
public class FInheritanceAndConstructor2 extends FB1 {

	FInheritanceAndConstructor2(int maxSpeed){
		super(maxSpeed);
		System.out.println("FInheritanceAndConstructor constructor");
	}
	
	public static void main(String[] args) {
		FInheritanceAndConstructor2 obj = new FInheritanceAndConstructor2(100);
		
	}
}
/*
FA Constructor 100
FB Constructor
FInheritanceAndConstructor constructor
*/