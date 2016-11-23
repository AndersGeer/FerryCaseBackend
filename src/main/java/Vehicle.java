

/**
 * Created by MJPS on 22/11/2016.
 */
public class Vehicle {
	
	private VehicleType type;
	private Reservation reservation;
	
	public Vehicle(VehicleType type, Reservation reservation) {
		this.type = type;
		this.reservation = reservation;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	
	public VehicleType getType() {
		return type;
	}
}
