import java.util.*;

/**
 * Created by geera on 22-Nov-16.
 */
public class Schedule
{

    private FerryLine ferryLine;
    private Set<DepartureTime> departures;

    public Schedule(FerryLine ferryLine) {
        this.ferryLine = ferryLine;
        departures = new HashSet<>();
    }

    public FerryLine getFerryLine() {
        return ferryLine;
    }

    public Set<DepartureTime> getDepartures() {
        return departures;
    }
}
