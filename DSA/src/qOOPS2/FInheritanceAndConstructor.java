package qOOPS2;


class FA{
	FA(){
		System.out.println("FA Constructor");
	}
}

class FB extends FA{
	
	FB(){
		System.out.println("FB Constructor");
	}
	
}
public class FInheritanceAndConstructor extends FB {

	FInheritanceAndConstructor(){
		System.out.println("FInheritanceAndConstructor constructor");
	}
	
	public static void main(String[] args) {
		FInheritanceAndConstructor obj = new FInheritanceAndConstructor();
		
	}
}
/*
FA Constructor
FB Constructor
FInheritanceAndConstructor constructor
*/