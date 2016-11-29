import com.sun.istack.internal.NotNull;
import com.sun.media.sound.InvalidDataException;
import org.apache.tools.ant.taskdefs.Local;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ReservationTest {
	
	private Reservation nullReservation;
	private Reservation reservation;
	private Person person;
	private Vehicle vehicle;
	
	LocalDate now;
	LocalDate localDate;
	Date yesterday;
	
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
		reservation = nullReservation;
		assertThat(reservation, is(nullValue(Reservation.class)));
	}
	
	@Test
	public void getVehicleIsTheSameTest() {
		assertThat(vehicle, isA(Vehicle.class));
		assertThat(reservation.getVehicle(), is(equalTo(vehicle)));
	}
	
	@Test
	public void passengerListSizeTest() {
		assertThat(reservation.getNoOfPassengers(), is(5));
	}
	
	@Test
	public void passengerListObjectsOfTypeTest() {
		assertThat(reservation.getPassengerList(), everyItem(isA(Passenger.class)));
	}
	
	@Test
	public void reservationDateIsNotBeforeTodayTest() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date today = calendar.getTime();
		
		
		assertThat(reservation.getReservationDate(), is(not(lessThan(today))));
	}
	
	@Test
	public void reservationDateIsBeforeTodayTest() {
		now = LocalDate.now();
		localDate = now.minusDays(1);
		yesterday = java.sql.Date.valueOf(localDate);
		nullReservation = new Reservation(100, yesterday, person,5,vehicle);
		assertThat(nullReservation.getReservationDate(), is(not(equalTo(now))));
		
	}
	
	@Test
	public void reservationConstructor1VehicleNotNullButNoneTest() {
		nullReservation = new Reservation(1, new Date(),person,1,null);
		
		
		assertThat(nullReservation.getVehicle(),is(notNullValue()));
		//if not null, should be None!
		assertThat(nullReservation.getVehicle().getType(),is(equalTo("None")));
	}
	@Test
	public void reservationConstructor2VehicleNotNullButNoneTest() {
		nullReservation = new Reservation(1, new Date(),person,1);
		
		
		assertThat(nullReservation.getVehicle(),is(notNullValue()));
		//if not null, should be None!
		assertThat(nullReservation.getVehicle().getType(),is(equalTo("None")));
	}
	
	@Test
	public void reservationOwnerHasSameToStringTest(){
		assertThat(reservation.getOwner(), hasToString("Person{firstName='null', lastName='null', mobileNo='null', email='null', address='null', reservations=1}"));
	}
	
	
	
}
