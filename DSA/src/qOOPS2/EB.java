package qOOPS2;

public class EB extends EA{

	int maxSpeed = 200;
	public void printSpeed() {
		System.out.println(super.maxSpeed);
		System.out.println(maxSpeed);
		
	}
	public void print() {
		super.print();
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		EB obj = new EB();
		obj.print();
		obj.printSpeed();
	}
}
