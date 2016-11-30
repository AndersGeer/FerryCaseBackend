import eto.FerryNotFoundException;
import eto.InvalidDataException;

import java.util.*;

public class Ferry
{

    private String serialNumber;
    private String Name;
    private boolean dockedState;
    private boolean lentState;
    private Set<FerryLine> ferryLines = new HashSet<FerryLine>();
    private Set<FerryConfig> ferryConfigs = new HashSet<>();

    public String getSerialNumber() {
        return serialNumber;
    }

    public Set<FerryConfig> getFerryConfigs() {
        return ferryConfigs;
    }

    public void addFerryConfig(int personLimit, int carLimit, int lorryLimit, int machineLimit) throws InvalidDataException {
        ferryConfigs.add(new FerryConfig(personLimit,carLimit,lorryLimit,machineLimit));
    }

    public String getName() {
        return Name;
    }

    public boolean isDockedState() {
        return dockedState;
    }

    public boolean isLentState() {
        return lentState;
    }

    public FerryLine getFerryLine(String startDestination, String endDestination) throws FerryNotFoundException {

        for (FerryLine fl: ferryLines)
        {
            if (fl.getStartDestination().equals(startDestination) && fl.getEndDestination().equals(endDestination)) {
                return fl;
            }
        }
        throw new FerryNotFoundException("The specified fery was not found");

    }

    public int addFerryLine(String startDest, String endDest)
    {
        FerryLine fl = new FerryLine(startDest, endDest);
        fl.setFerry(this);
        ferryLines.add(fl);
        if (ferryLines.contains(fl))
        {
            return 1;
        }

        return -1;

    }

    public FerryLine deleteFerryLine(String startDestination, String endDestination) throws FerryNotFoundException {

        for (FerryLine fl: ferryLines)
        {
            if (fl.getStartDestination().equals(startDestination) && fl.getEndDestination().equals(endDestination))
            {
                ferryLines.remove(fl);
                return fl;
            }
        }
        throw new FerryNotFoundException("The specified ferry was not found");

    }

    public Ferry(String serialNumber,
                 String name,
                 boolean dockedState,
                 boolean lentState,
                 String startDestination,
                 String endDestination,
                 int personLimit,
                 int carLimit,
                 int lorryLimit,
                 int machineLimit) throws InvalidDataException {
        if (serialNumber != null &&
                serialNumber.trim().length() == 5 &&
                name.trim().length() > 5 &&
                startDestination.trim().length() > 3 &&
                endDestination.trim().length() > 3) {
            this.serialNumber = serialNumber;
            Name = name;
            addFerryLine(startDestination, endDestination);
            addFerryConfig(personLimit, carLimit, lorryLimit, machineLimit);
        }
        else
        {
            throw new InvalidDataException("Ferry was not created due to invalid data");
        }
        this.dockedState = dockedState;
        this.lentState = lentState;


    }
}
