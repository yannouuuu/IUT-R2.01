package semaine4.td04.exercice01.q2;
import java.util.ArrayList;

public class Stallion {
    private final int MAX;
    public ArrayList<Descendant> children;

    public Stallion(int maxValue, Descendant offspring){
        this.MAX = maxValue;
        this.children = new ArrayList<Descendant>();
        this.children = new Stallion[MAX];
    }

    public boolean addDescendant(Descendant offspring){
        if(this.children.size() < MAX){
            this.children.add(offspring);
            return true;
        }
        return false;
    }
}
