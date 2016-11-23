import java.time.LocalTime;

/**
 * Created by geera on 23-Nov-16.
 */
public class DepartureTime
{

private LocalTime departureTime;

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public DepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
