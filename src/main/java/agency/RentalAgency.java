package agency;

import javax.lang.model.element.UnknownElementException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class RentalAgency  {
    Map<Client, Vehicle> rentedVehicles;            //les associations entre clients et véhicules loués.
    private List<Vehicle> vehicles;                         //la liste des véhicules de l’agence,

   public  boolean aVehicleIsRentedBy(Client client){
    return false;
   }
    private Collection<Vehicle> allRentedVehicles(){
       return allRentedVehicles();
    }




    RentalAgency() {
        this.vehicles = null;
    }

    public RentalAgency(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    boolean add(Vehicle vehicle) {
        if (this.vehicles.contains(vehicle)) {
            return false;
        }else
            vehicles.add(vehicle);
        return true;
    }


    void remove(Vehicle vehicle){
        if(vehicle != vehicles) throw new UnknownVehicleException(vehicle);
        vehicles.remove(vehicle);
    }

    public  boolean contains(Vehicle vehicle){
        return vehicle == vehicles;
    }

    List<Vehicle> getVehicles() {
        return vehicles;
    }


}
