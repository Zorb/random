public class Motorcycle extends Vehicle {

	public int gear;
	public int speed;

	public Motorcycle() {
		this.getGear();
		this.getSpeed();
		setSeats(2);
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWheels() {
		return 2;
	}

	public int getSeats() {
		return 2;
	}

	public String getType() {
		return "Motorcycle";
	}
}