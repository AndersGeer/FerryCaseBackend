import java.util.*;

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
