package qOOPS1;

public class FStudent {

	private int rollNumber;
	public String name;
	
	
	public FStudent(int num,String name) {
		this.rollNumber = num;
		this.name = name;
	}
	
	public FStudent(String name) {
		this.name = name;
	}
	
	public FStudent() {
		
	}
	
	public void print() {
		System.out.println(this.rollNumber+" "+this.name);
	}
}
