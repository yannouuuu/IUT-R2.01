package semaine1.tp01;
public class UseBook2 {
    public static void main(String[] args) {
        Book[] library = {
            new Book("Victor Hugo", "Les Misérables", 1862),
            new Book("Albert Camus", "L'Étranger", 1942),
            new Book("Émile Zola", "Germinal", 1885),
            new Book("Marcel Proust", "À la recherche du temps perdu", 1913),
            new Book("Antoine de Saint-Exupéry", "Le Petit Prince", 1943)
        };
        
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }  
        
        Book oldest = library[0];
        for (int i = 1; i < library.length; i++) {
            if (oldest.isOldest(library[i])) {
            } else {
                oldest = library[i];
            }
        }
        
        System.out.println("The oldest book is: " + oldest);
    }
}
