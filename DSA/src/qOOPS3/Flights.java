package qOOPS3;

public class Flights implements PrintInterface{

	int maxSpeed;
	
	public Flights(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println(maxSpeed+" maxSpeed");
	}
}
