package semaine6.tp06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<Car> autos;
    
    public Dealership() {
        this.autos = new ArrayList<>();
    }
    
    // Q10: Méthode pour ajouter une voiture à la concession
    public void addCar(Car v) {
        autos.add(v);
    }
    
    // Q11: Méthodes de fabrique pour créer les instances appropriées
    
    // Méthode createCar avec tous les paramètres
    public static Car createCar(String brand, LocalDate onRoad, double purchasePrice, LocalDate onSale, double salePrice, int mileage) {
        // Vérifier si la voiture a plus de 40 ans
        if (LocalDate.now().getYear() - onRoad.getYear() >= 40) {
            return new Vintage(brand, onRoad, purchasePrice, onSale, salePrice, mileage);
        } else {
            return new Car(brand, onRoad, purchasePrice, onSale, salePrice, mileage);
        }
    }
    
    // Méthode createCar avec paramètres minimaux (utilisant les valeurs par défaut)
    public static Car createCar(String brand, LocalDate onRoad, double purchasePrice, int mileage) {
        // Vérifier si la voiture a plus de 40 ans
        if (LocalDate.now().getYear() - onRoad.getYear() >= 40) {
            return new Vintage(brand, onRoad, purchasePrice, mileage);
        } else {
            return new Car(brand, onRoad, purchasePrice, mileage);
        }
    }
    
    // Méthode pour obtenir la liste des voitures
    public List<Car> getAutos() {
        return new ArrayList<>(autos); // Retourne une copie pour éviter la modification directe
    }
    
    // Méthode toString pour afficher les informations de la concession
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Concession automobile:\n");
        for (Car car : autos) {
            sb.append("- ").append(car).append("\n");
        }
        return sb.toString();
    }
}
