/**
 * Created by MJPS on 22/11/2016.
 */
public enum VehicleType {
	
	BICYCLE ("Bicycle"),
	MOTORCYCLE ("Motorcycle"),
	SCOOTER ("Scooter"),
	LORRY ("Lorry"),
	CAR ("Car"),
	MACHINERY ("Machinery"),
	BUS ("Bus"),
	NONE ("None");
	
	private final String type;
	
	private VehicleType(String type) {
		this.type = type;
	}
	
	public String getTypeDescription() {
		return type;
	}
	
}
