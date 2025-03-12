package semaine4.td04.Exercice02;

import java.util.ArrayList;

public class Stacking {
    private final int MAX;
    private ArrayList<Book> myStacking;

    public Stacking(int aSize, ArrayList<Book> books) {
        this.MAX = aSize;
        this.myStacking = books;
    }
    public Stacking(int aSize) {
        this(aSize, new ArrayList<Book>());
    }
    public boolean isFull() {

    }
    public boolean isEmpty() {}
    public int size() {}
    public Book top() {}
    public void add(Book b) {}
    public Book remove() {}
    public String toString() {}
    public int getTotalWeight() {}
}

