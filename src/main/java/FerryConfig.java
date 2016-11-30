import eto.InvalidDataException;

public class FerryConfig
{

    private FerryLine ferryLine;

    private int personLimit;
    private int carLimit;
    private int lorryLimit;
    private int machineLimit;


    public int getPersonLimit() {
        return personLimit;
    }

    public int getCarLimit() {
        return carLimit;
    }

    public int getLorryLimit() {
        return lorryLimit;
    }

    public int getMachineLimit() {
        return machineLimit;
    }

    public FerryConfig(int personLimit, int carLimit, int lorryLimit, int machineLimit) throws InvalidDataException {
        if (personLimit >= 0 && carLimit >= 0 && lorryLimit >= 0 && machineLimit >= 0) {
            this.personLimit = personLimit;
            this.carLimit = carLimit;
            this.lorryLimit = lorryLimit;
            this.machineLimit = machineLimit;
        }
        else
        {
            throw new InvalidDataException("The ferryconfig data is wrong");
        }
    }
}
