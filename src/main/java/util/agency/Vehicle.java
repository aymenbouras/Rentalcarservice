package src.main.java.util.agency;

public interface Vehicle {
    //Contrat
    public abstract String getBrand();              //renvoie la marque du véhicule.
    public abstract String getModel();              // renvoie le modèle du véhicule.
    public abstract int getProductionYear();        //renvoie l’année de fabrication du véhicule.
    public abstract double dailyRentalPrice();      //renvoie  le prix de la location pour un jour du véhicule.
    public abstract boolean equals(Object o);       // teste l’égalité entre le véhicule et l’objet o.
    public abstract String toString();              // renvoie une chaîne de caractères
}
