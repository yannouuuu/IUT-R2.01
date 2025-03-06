package td04a;

// Majuscule = final
// Souligné = static

// QUESTION 1.2
public class Donkey{
    private static int nbMeal = 4; // static doit etre initialisé directement  // static car _____
    private final EquineBreed MY_BREED; // peut etre initialisé dans le constructeur parce que pas de final  // final car MAJUSCULE


    public Donkey(){
        this.MY_BREED = EquineBreed.DONKEY;
    }

    public String toString(){
        return "Je suis un " + MY_BREED + " et j'ai " + nbMeal + " repas par jour.";
    }
}
