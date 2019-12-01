package agency;
import java.util.List;
import java.util.function.Predicate;

public class MaxPriceCriterion implements Predicate<Vehicle> {

    public List<Vehicle> select(Predicate<Vehicle> criterion){
        return (List<Vehicle>) criterion;
    }
    public void printSelectedVehicles(Predicate<Vehicle> criterion){
        System.out.println(select(criterion));
    }

    @Override
    public boolean test(Vehicle vehicle) {
        return false;
    }
}
