package td04.Exercice02;

public class Book {
    private int weight=0;
    private String title = "";

    public Book() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "weight=" + weight +
                ", title='" + title + '\'' +
                '}';
    }

    public Book(String title, int weight) {
        this.title = title;
        this.weight = weight;
    }
}
