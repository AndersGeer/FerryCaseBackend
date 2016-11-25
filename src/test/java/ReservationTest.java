import com.sun.media.sound.InvalidDataException;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ReservationTest {
	
	private Reservation nullReservation;
	private Reservation reservation;
	private Person person;
	private Vehicle vehicle;
	
	@Before
	public void setup() {
		person = new Person();
		vehicle = new Vehicle(VehicleType.BUS);
		
		reservation = new Reservation(100,new Date(),person,5,vehicle);
		
	}
	
	@Test
	public void objectNotNull() {
		assertNotNull(reservation);
	}
	
	@Test
	public void objectIsNull() {
		assertNull(nullReservation);
	}
	
	@Test
	public void getVehicleIsTheSameTest() {
		//assertThat(vehicle, isA(Vehicle.class));
		System.out.println(reservation.getVehicle());
		//assertThat(reservation.getVehicle(), is(equalTo(vehicle)));
	}
	
	@Test
	public void passengerListSizeTest() {
		assertThat(reservation.getPassengerList(), hasSize(5));
	}
	
	
	
	@Test
	public void toStringTest() {
		assertEquals("", reservation.toString());
	}
}
