package agency;

public class UnknownVehicleException extends RuntimeException {

    Vehicle vehicle;        //vehicule qu'on va essaye de l'enlever

    public UnknownVehicleException(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getMessage() {
        return toString() + "does not exist in the agency";
    }
}
