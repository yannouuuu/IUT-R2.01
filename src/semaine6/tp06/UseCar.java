package semaine6.tp06;

import java.time.LocalDate;

public class UseCar {
    public static void main(String[] args) {
        // Création d'une voiture standard
        Car standardCar = new Car("Peugeot 205", LocalDate.of(1990, 5, 15), 15000.0, 10000);
        
        // Création d'une voiture de collection avec les mêmes caractéristiques
        Vintage vintageCar = new Vintage("Peugeot 205", 
                                        LocalDate.of(1990, 5, 15), 
                                        15000.0, 
                                        10000);
        
        // Affichage des deux voitures
        System.out.println("Voiture standard:");
        System.out.println(standardCar);
        System.out.println("\nVoiture de collection:");
        System.out.println(vintageCar);
        
        // Affichage des taux de décote temporelle
        System.out.println("\nTaux de décote temporelle pour voiture standard: " + Car.getTemporalDropRate());
        System.out.println("Taux de décote temporelle pour voiture de collection: " + Vintage.getTemporalDropRate());
        
        // Calcul et affichage de la valeur actuelle des deux voitures
        System.out.println("\nValeur actuelle de la voiture standard: " + standardCar.currentValue() + " €");
        System.out.println("Valeur actuelle de la voiture de collection: " + vintageCar.currentValue() + " €");
    }
}


/*
 * La voiture standard aura une valeur diminuée en raison du taux de décote temporelle standard (qui est probablement positif dans la classe Car).
 * La voiture de collection aura une valeur plus élevée car son taux de décote temporelle est nul (0.0).
 */