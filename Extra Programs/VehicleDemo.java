class Vehicle{
	int noOfPerson;
	String color;
	int cc;
	int noOfGears=5;
	double milage;
	String fueltype;
	double Price;
	String modelName;
	int manufacturingYear;
	int scrapeYear;
}
class Bike extends Vehicle{
	boolean isMoped;
	String standType;
	boolean isKickStart;
}
class Car extends Vehicle{
	int noOfAirBag=2;
	double acCapacity;
	boolean isPowerStrearing;
}
public class VehicleDemo{
	public static void main(String[] args) {
		Car audi=new Car();
		audi.noOfAirBag=6;
		System.out.println(audi.noOfGears);
	}
}
 class IPhone{
 	public void alarm(){
 		System.out.println("Enter setting");
 		System.out.println("Enter submenu");
 		System.out.println("Enter clock");
 		System.out.println("Enter setting");
 		System.out.println("Enter setting");
 		System.out.println("Enter setting");
 	}
 }
 class Phone{
 	public void alarm(){
 		System.out.println("Enter clock");
 		System.out.println("set time");
 		System.out.println("Alarm Set Done");
 	}
 }
 class Android(){
 	
 }