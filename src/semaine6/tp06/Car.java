package semaine6.tp06;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Car {
    // Variables de classe (constantes pour toutes les voitures)
    private static double temporalDropRate = 0.001; // Décote due à l'âge
    private static double mileageDropRate = 0.002;  // Décote due au kilométrage
    
    // Attributs constants pour une voiture
    private final String brand;
    private final LocalDate onRoad;
    private final double purchasePrice;
    
    // Attributs variables
    private LocalDate onSale;
    private double salePrice;
    private int mileage;
    
    // Constructeur complet
    public Car(String brand, LocalDate onRoad, double purchasePrice, LocalDate onSale, double salePrice, int mileage) {
        this.brand = brand;
        this.onRoad = onRoad;
        this.purchasePrice = purchasePrice;
        this.onSale = onSale;
        setSalePrice(salePrice);
        this.mileage = mileage;
    }
    
    // Constructeur avec valeurs par défaut
    public Car(String brand, LocalDate onRoad, double purchasePrice, int mileage) {
        this.brand = brand;
        this.onRoad = onRoad;
        this.purchasePrice = purchasePrice;
        this.onSale = LocalDate.now();
        this.salePrice = purchasePrice;
        this.mileage = mileage;
    }
    
    // Accesseurs et mutateurs
    public String getBrand() {
        return brand;
    }
    
    public LocalDate getOnRoad() {
        return onRoad;
    }
    
    public double getPurchasePrice() {
        return purchasePrice;
    }
    
    public LocalDate getOnSale() {
        return onSale;
    }
    
    public void setOnSale(LocalDate onSale) {
        this.onSale = onSale;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public static double getTemporalDropRate() {
        return temporalDropRate;
    }
    
    public static double getMileageDropRate() {
        return mileageDropRate;
    }
    
    // Méthode privée pour définir le prix de vente
    private void setSalePrice(double salePrice) {
        this.salePrice = salePrice > 0 ? salePrice : 0;
    }
    
    // Calcul du taux de décote
    public double computeDropRate() {
        // Calcul de l'âge en mois
        long ageInMonths = ChronoUnit.MONTHS.between(onRoad, onSale);
        
        // Calcul de la décote due à l'âge
        double temporalDrop = ageInMonths * getTemporalDropRate();
        
        // Calcul de la décote due au kilométrage (par tranche de 1000 km)
        double mileageDrop = (mileage / 1000.0) * getMileageDropRate();
        
        // Retourne le taux cumulé
        return temporalDrop + mileageDrop;
    }
    
    // Estimation du prix de vente
    public void priceEstimation() {
        double dropRate = computeDropRate();
        double estimatedPrice = purchasePrice * (1 - dropRate);
        setSalePrice(estimatedPrice);
    }
    
    // Accesseur pour le prix de vente avec estimation préalable
    public double getSalePrice() {
        priceEstimation();
        return salePrice;
    }
    
    @Override
    public String toString() {
        return "Car [" + brand + "," + onRoad + "," + mileage + "km," + salePrice + "euros]";
    }
}