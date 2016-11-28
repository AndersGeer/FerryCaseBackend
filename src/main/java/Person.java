import java.util.ArrayList;
import java.util.List;

/**
 * Created by MJPS on 22/11/2016.
 */
public class Person {
	
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String email;
	private String address; //TODO: Maybe create a new class?
	private List<Reservation> reservationList = new ArrayList<>();
	
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, String mobileNo, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
	}
	
	public void addReservation(Reservation reservation) {
		if (reservation == null) {
			throw new NullPointerException("Reservation cannot be null");
		} else {
			this.reservationList.add(reservation);
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public List<Reservation> getReservations() {
		return reservationList;
	}
	
	public int noOfReservation() {
		return reservationList.size();
	}
	
	
	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", mobileNo='" + mobileNo + '\'' +
				", email='" + email + '\'' +
				", address='" + address + '\'' +
				", reservations=" + reservationList.size() +
				'}';
	}
}
