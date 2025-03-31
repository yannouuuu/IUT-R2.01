package semaine6.tp06;

import java.time.LocalDate;

public class Vintage extends Car {
    // Masquage de l'attribut de classe temporalDropRate avec une valeur nulle
    private static double temporalDropRate = 0.0;
    
    public Vintage(String brand, LocalDate onRoad, double purchasePrice, LocalDate onSale, double salePrice, int mileage) {
        super(brand, onRoad, purchasePrice, onSale, salePrice, mileage);
    }
    
    public Vintage(String brand, LocalDate onRoad, double purchasePrice, int mileage) {
        super(brand, onRoad, purchasePrice, mileage);
    }
    
    // Masquage de la méthode getTemporalDropRate pour utiliser la valeur nulle
    public static double getTemporalDropRate() {
        return temporalDropRate;
    }
    
    // Redéfinition de la méthode getMileageDropRate
    public static double getMileageDropRate() {
        // Réduire le taux de décote kilométrique pour les voitures de collection
        // Par exemple, moitié moins que pour une voiture standard
        return Car.getMileageDropRate() / 2.0;
    }
    
    // Redéfinition de la méthode currentValue pour utiliser nos propres taux
    @Override
    public double currentValue() {
        int age = LocalDate.now().getYear() - getOnRoad().getYear();
        // Utilise les taux spécifiques à Vintage
        return getPurchasePrice() * (1 - getTemporalDropRate() * age - getMileageDropRate() * getMileage());
    }
}
