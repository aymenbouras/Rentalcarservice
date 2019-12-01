package agency;

import java.util.function.Predicate;

public class BrandCriterion implements Predicate<Vehicle> {
    public  String brand;           //marque du vehicule (selection)

    public BrandCriterion(String brand) {
        this.brand = brand;
    }


    @Override
    public boolean test(Vehicle vehicle){
        if(vehicle.getBrand() == this.brand){
            return true;
        }else {
            return false;
        }
    }



}
