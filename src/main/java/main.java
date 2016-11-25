
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
        
        Person person = new Person();
        Vehicle vehicle = new Vehicle(VehicleType.BICYCLE);
        
        Reservation reservation = new Reservation(100,new Date(),person,5,vehicle);
//        System.out.println(reservation.getNoOfPassengers());
//        System.out.println(reservation.getOwner());
//        System.out.println(reservation.getPassengerList());
//        System.out.println(reservation.getPrice());
//        System.out.println(reservation.getReservationDate());
//        System.out.println(vehicle);
        
        
        
        
        
        
    }

}
