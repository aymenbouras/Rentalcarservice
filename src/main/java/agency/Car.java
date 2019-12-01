package agency;


import static util.TimeProvider.*;

public class Car implements Vehicle{
    private String brand;               //marque de la voiture
    private String model;               //nom du Model de voiture
    private int productionYear;         //année de production
    private int numberOfSeats;          //nombre de siege

    public Car(String brand, String model, int productionYear, int numberOfSeats) {
        this.brand = brand;
        this.model = model;

        this.productionYear = productionYear;
        if ( productionYear < 1900 || productionYear > currentYearValue())
            throw new IllegalArgumentException("the year given in argument : " + productionYear +
                    " ,must be greater than 1900 and lower than the current year");

        this.numberOfSeats = numberOfSeats;
        if ( numberOfSeats < 1) throw new IllegalArgumentException("the number of seats given in argument : "
                + numberOfSeats + " ,must be greater than 1");
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getProductionYear() {
        return this.productionYear;
    }

    @Override
    public double dailyRentalPrice() {
        return 0;
    }


    @Override
    public String toString() {
        return "type of vehicle : " + " Car"+ "\n" +
                "the vehicle brand : " + brand + "\n" +
                "the model of the vehicle : " + model + "\n" +
                "the year of manufacture of the vehicle : "+ productionYear + ", " +
                "with " +  numberOfSeats + " : " + dailyRentalPrice() + " €";
    }
}
