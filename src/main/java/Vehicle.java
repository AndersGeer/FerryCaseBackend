import com.sun.media.sound.InvalidDataException;

/**
 * Created by MJPS on 22/11/2016.
 */
public class Vehicle {
	
	private VehicleType type = VehicleType.NONE;
	private Reservation reservation;
	
	
	public Vehicle(VehicleType type) {
		this.type = type;
	}
	
	public Reservation getReservation() {
		return this.reservation;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public String getType() {
		return this.type.getTypeDescription();
	}
	
	
	@Override
	public String toString() {
		return "Vehicle{" +
				"type=" + getType()+
				'}';
	}
}
