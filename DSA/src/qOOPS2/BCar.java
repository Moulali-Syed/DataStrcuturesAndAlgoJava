package qOOPS2;

public class BCar extends BVehicle{

	private int maxSpeed;
	int numDoors;
	
	public void setMaxSpeed(int speed) {
		this.maxSpeed = speed;
	}
	
	public void print() {
		System.out.println("Vehicle "+" color "+color+ " Speed "+maxSpeed +" number of doors "+numDoors);
	} 
}
