import java.util.List;

/**
 * Created by MJPS on 22/11/2016.
 */
public class Passenger {
	
	private Reservation reservation;
	
	public Passenger() {
	}
	
	public Passenger(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	
	
	
}

