import org.junit.Before;
import org.junit.Test;
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
	
	@Test(expected = NullPointerException.class)
	public void nullPointerExceptionTest() {
		vehicle.getReservation();
	}
	
	@Test
	public void getReservationIsNotNullTest() {
		vehicle = new Vehicle(VehicleType.BICYCLE);
		assertNotNull(vehicle.getReservation());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("Vehicle{type=None, reservation=null}", vehicle.toString());
	}
	
	
	
	
}
