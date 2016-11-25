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
	
	@Test
	public void toStringTest() {
		assertEquals("Vehicle{type=None}", vehicle.toString());
	}
	
	
	
	
}
