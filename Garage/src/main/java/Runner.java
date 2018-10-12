
public class Runner {

	public static void main(String[] args) {
		Vehicle myCar = new Car();
		System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfSeats() + " seats.");
		System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfWheels() + " wheels.");

		Vehicle myBus = new Motorcycle();
		System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfSeats() + " seats.");
		System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfWheels() + " wheels.");
	}
}