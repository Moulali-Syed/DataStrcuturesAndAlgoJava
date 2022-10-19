package qOOPS2;

public class BVehicleUse {

	public static void main(String[] args) {
		BVehicle v = new BVehicle();
		v.color = "red";
		v.print();
		
		BCar c = new BCar();
		c.color = "black";
//		c.maxSpeed = 100;
		c.setMaxSpeed(100);
		c.numDoors = 3;
		c.print();
		
		BBicycle b = new BBicycle();
		b.color = "blue";
		b.maxSpeed = 20;
		b.print();
		
	}
}
