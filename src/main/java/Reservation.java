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
	public Reservation(int price, Date reservationDate, Person owner, int noOfPassengers, Vehicle vehicle) {
		setPrice(price);
		setReservationDate(reservationDate);
		setOwner(owner);
		setPassengerList(noOfPassengers);
		setVehicle(vehicle);
	}
	
	//-Vehicle
	public Reservation(int price, Date reservationDate, Person owner, int noOfPassengers) {
		setPrice(price);
		setReservationDate(reservationDate);
		setOwner(owner);
		setPassengerList(noOfPassengers);
		setVehicle(this.vehicle);
	}
	
	public Reservation() {
		
	}
	
	//endregion
	
	//region Getters
	public int getPrice() {
		return this.price;
	}
	
	public Date getReservationDate() {
		return this.reservationDate;
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	public int getNoOfPassengers() {
		return this.passengerList.size();
	}
	
	public List<Passenger> getPassengerList() {return passengerList;}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	//endregion
	
	//region Restriction Setters
	private void setPrice(int price) {
		
		
		try {
			if (price < 0) {
				throw new InvalidDataException("Reservation is Invalid, price cannot be negative");
			} else if (price > Integer.MAX_VALUE) {
				throw new InvalidDataException("'price' cannot exceed " + Integer.MAX_VALUE);
			} else {
				this.price = price;
			}
		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void setReservationDate(Date reservationDate) {
		try {
			if (checkDate(reservationDate)) {
				throw new InvalidDataException("Date of Reservation Expired!");
			} else {
				this.reservationDate = reservationDate;
			}
		} catch (InvalidDataException e){
			System.out.println(e.getMessage());
		}
	}
	
	private void setOwner(Person owner) {
		try {
			if (owner == null) {
				throw new NullPointerException(owner + " is null, owner required for valid reservation!");
			} else {
				this.owner = owner;
				owner.addReservation(this);
			}
		} catch (NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
	
	private void setPassengerList(int noOfPassengers) {
		try {
			if (noOfPassengers > 0){
				this.passengerList = new ArrayList<>();
				for (int x = 0; x < noOfPassengers; x++) {
					this.passengerList.add(new Passenger(this));
				}
			} else if (this.passengerList.isEmpty() || noOfPassengers == 0) {
				throw new InvalidDataException("List of Passengers is Empty (Not Allowed)");
			}  else if (this.passengerList == null) {
				throw new NullPointerException("List of Passengers is null");
			}
			
		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void setVehicle(Vehicle veh) {
		if (veh == null) {
			vehicle = new Vehicle(VehicleType.NONE);
		} else {
			veh.setReservation(this);
			vehicle = veh;
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
