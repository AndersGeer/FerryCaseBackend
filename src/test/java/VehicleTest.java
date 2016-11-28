import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class VehicleTest {
	
	private Vehicle vehicle;
	
	@Before
	public void setup() {
		vehicle = new Vehicle(VehicleType.NONE);
	}
	
	@Test
	public void notTypeNull() {
		assertNotNull(vehicle.getType());
	}
	
	@Test
	public void getTypeTest() {
		assertEquals("None", vehicle.getType());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("Vehicle{type=None}", vehicle.toString());
	}
	
	@Test
	public void getReservationIsNull(){
		assertThat(vehicle.getReservation(), nullValue());
	}
	
	@Test
	public void getReservationIsNotNull(){
		Reservation reservation = new Reservation(2,new Date(),new Person(),2,vehicle);
		assertThat(vehicle.getReservation(), is(equalTo(reservation)));
	}
	
	
	
}
