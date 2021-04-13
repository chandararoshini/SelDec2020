package week1.day1;

public class Car {
	
	String bodyColor = "red";
	int numWheels = 4;
	String regNumber = "TN 00 BU1676";
	char fuelType ='D';
	double fuelCapacity = 56.25;
	boolean isPuncture =false;

	public void driveCar() {

System.out.println("I drive a car");

	}
	public void applyBrake() {
		System.out.println("brake applied");

	}
	
	public static void main(String[] args) {
		
		Car object = new Car();
		object.driveCar();
		object.applyBrake();
		String color = object.bodyColor;
		System.out.println(color);
		int wheels = object.numWheels;
		System.out.println(wheels);
		System.out.println(object.regNumber);
		System.out.println(object.fuelCapacity);
		System.out.println(object.fuelType);
		System.out.println(object.isPuncture);
	}
}
