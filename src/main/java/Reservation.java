import com.sun.media.sound.InvalidDataException;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.*;

/**
 * Created by MJPS on 22/11/2016.
 */
public class Reservation {
	
	private int price;
	private Date reservationDate;
	private Person owner;
	private List<Passenger> passengerList;
	private Vehicle vehicle = null;
	private Calendar calendar;
	
	
	
	//region Constructors
	//+Vehicle
	public Reservation(int price, Date reservationDate, Person owner, int noOfPassengers, Vehicle vehicle, VehicleType type) throws InvalidDataException {
		setPrice(price);
		setReservationDate(reservationDate);
		setOwner(owner);
		setPassengerList(noOfPassengers);
		setVehicles(vehicle,type);
	}
	
	//-Vehicle
	public Reservation(int price, Date reservationDate, Person owner, int noOfPassengers) throws InvalidDataException {
		setPrice(price);
		setReservationDate(reservationDate);
		setOwner(owner);
		setPassengerList(noOfPassengers);
		setVehicles(this.vehicle, null);
	}
	//endregion
	
	//region Getters
	public int getPrice() {
		return price;
	}
	
	public Date getReservationDate() {
		return reservationDate;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public int getNoOfPassengers() {
		return passengerList.size();
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	//endregion
	
	//region Restriction Setters
	private void setPrice(int price) throws InvalidDataException {
		if (price < 0) {
			throw new InvalidDataException("Reservation is Invalid");
		} else if (price > Integer.MAX_VALUE) {
			throw new InvalidDataException("'price' cannot exceed "+Integer.MAX_VALUE);
		} else {
			this.price = price;
		}
	}
	
	private void setReservationDate(Date reservationDate) throws InvalidDataException {
		if (checkDate(reservationDate)) {
			throw new InvalidDataException("Date of Reservation Expired!");
		} else {
			this.reservationDate = reservationDate;
		}
	}
	
	private void setOwner(Person owner) {
		
		if (owner == null) {
			throw new NullPointerException(owner+" is null, owner required for valid reservation!");
		} else {
			this.owner = owner;
			owner.addReservation(this);
		}
	}
	
	private void setPassengerList(int noOfPassengers) throws InvalidDataException {
		if (passengerList.isEmpty() || passengerList == null) {
			throw new InvalidDataException("List of Passengers is null or Empty");
		} else {
			passengerList = new ArrayList<>();
			for (int x = 0; x < noOfPassengers; x++) {
				passengerList.add(new Passenger(this));
			}
		}
	}
	
	private void setVehicles(Vehicle vehicle, VehicleType type) throws InvalidDataException {
		if (vehicle == null) {
			this.vehicle = new Vehicle(VehicleType.NONE, this);
		} else {
			this.vehicle = new Vehicle(type, this);
		}
	}
	
	//endregion
	
	private boolean checkDate(Date reservationDate) {
		// set the calendar to start of today
		calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		if (reservationDate.before(calendar.getTime())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return "Reservation{" +
				"price=" + price +
				", reservationDate=" + reservationDate +
				", owner=" + owner +
				", passengerList=" + passengerList +
				", vehicle=" + vehicle +
				'}';
	}
}
