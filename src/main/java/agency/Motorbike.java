package agency;

import static util.TimeProvider.currentYearValue;

public class Motorbike extends AbstractVehicle implements Vehicle  {

    private int cylinderCapacity;           //la cylindrée en centimètre cube de la moto.



    public Motorbike(String brand, String model, int productionYear, int cylinderCapacity) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        if ( productionYear < 1900 || productionYear > currentYearValue())
            throw new IllegalArgumentException("the year given in argument : " + productionYear +
                    " ,must be greater than 1900 and lower than the current year");

        this.cylinderCapacity = cylinderCapacity;
        if ( cylinderCapacity < 50) throw new IllegalArgumentException("the number of cylinderCapacity given in argument : "
                + cylinderCapacity + " ,must be greater than 50");


    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public double dailyRentalPrice() {
        return 0.25 * cylinderCapacity;
    }

    @Override
    public String toString() {
        return "Motorbike"+ " " + brand + " " + model +
                " "+productionYear +
                " (" +  cylinderCapacity  + "cm³" + ")"  + " : " + dailyRentalPrice() + "€";
    }
}
