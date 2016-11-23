
import com.sun.media.sound.InvalidDataException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by geera on 22-Nov-16.
 */
public class main
{

    public static void main(String[] args) throws InvalidDataException {

        System.out.println("Hello world");
    
        List<Passenger> passengers = new ArrayList<Passenger>();
        
        passengers.add(new Passenger());
        passengers.add(new Passenger());
        passengers.add(new Passenger());
        passengers.add(new Passenger());
    
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
    
        //vehicles.add(new Vehicle(VehicleType.Bicycle));
        //vehicles.add(new Vehicle(VehicleType.Car));
        //vehicles.add(new Vehicle(VehicleType.Motorcycle));
        //vehicles.add(new Vehicle(VehicleType.Car));
        
        //Reservation r = new Reservation(100,new Date(),new Person(),passengers, vehicles);
    
        System.out.println();
    
    
        Calendar calendar;
        calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    
        Date newD = new Date(0);
    
        System.out.println(newD);
        System.out.println(calendar.getTime());
    
        System.out.println(newD.before(calendar.getTime()));
        
        
        
    }

}
