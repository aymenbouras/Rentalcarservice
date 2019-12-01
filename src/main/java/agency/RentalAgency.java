package agency;

import javax.lang.model.element.UnknownElementException;
import java.util.List;

public class RentalAgency {

    List<Vehicle> vehicles;         //la liste des véhicules de l’agence,

    public RentalAgency() {
        this.vehicles = null;
    }

    public RentalAgency(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public  boolean add(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            return false;
        }else
            vehicles.add(vehicle);
        return true;
    }


    public  void remove(Vehicle vehicle){
        if(vehicle != vehicles) throw new UnknownVehicleException(vehicle);
        vehicles.remove(vehicle);
    }

    public  boolean contains(Vehicle vehicle){
        if(vehicle == vehicles){
            return true;
        }else {
            return false;
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
