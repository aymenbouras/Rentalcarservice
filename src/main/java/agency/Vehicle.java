package agency;

public interface Vehicle {

        //Contrat
         String getBrand();              //renvoie la marque du véhicule.
         String getModel();              // renvoie le modèle du véhicule.
         int getProductionYear();        //renvoie l’année de fabrication du véhicule.
         double dailyRentalPrice();      //renvoie  le prix de la location pour un jour du véhicule.
         boolean equals(Object o);       // teste l’égalité entre le véhicule et l’objet o.
         String toString();              // renvoie une chaîne de caractères

}
