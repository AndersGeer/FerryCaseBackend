import java.util.HashSet;
import java.util.Set;


public class FerryLine {

    private String startDestination;
    private String endDestination;
    private Ferry ferry;
    private Set<Schedule> schedules;

    public FerryLine(String startDestination, String endDestination) {
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        ferry = null;
        schedules = new HashSet<>();
    }

    public String getStartDestination() {
        return startDestination;
    }

    public String getEndDestination() {
        return endDestination;
    }

    public void setFerry(Ferry ferry)
    {
        this.ferry = ferry;
    }

    public Ferry getFerry() {
        return ferry;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }



}
