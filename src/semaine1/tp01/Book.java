package semaine1.tp01;

public class Book {
    private String author;
    private String title;
    private int year;
    
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    
    public String toString() {
        return this.author + ";" + this.title + ";" + this.year;
    }
    
    public boolean isOldest(Book other) {
        return this.year < other.year;
    }
}
