import java.util.HashSet;
import java.util.Set;

/**
 * Created by geera on 22-Nov-16.
 */
public class FerryLine {

    private String startDestination;
    private String endDestination;
    private Ferry ferry;
    private Set<Schedule> schedules = new HashSet<>();
    private Set<FerryConfig> ferryConfigs = new HashSet<>();


    public String getStartDestination() {
        return startDestination;
    }

    public String getEndDestination() {
        return endDestination;
    }

    public Ferry getFerry() {
        return ferry;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }

    public Set<FerryConfig> getFerryConfigs() {
        return ferryConfigs;
    }


}
