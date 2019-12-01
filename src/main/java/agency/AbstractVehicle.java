package agency;

public abstract class AbstractVehicle {
    String brand;               //marque de la voiture
    String model;               //nom du Model de voiture
    int productionYear;         //année de production

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public abstract double dailyRentalPrice();

    public abstract String toString();
}
