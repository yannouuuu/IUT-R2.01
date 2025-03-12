package semaine4.td04.exercice01.q2;

// QUESTION 2.1
public class Mare {
    private static final int MAX = 5;
    public Descendant[] children;

    public Mare(){
        this.Descendant = new Descendant[MAX];
    }

    public boolean addDescendant(Descendant offspring){
        for(int i = 0; i < MAX; i++){
            if(this.children[i] == null){
                this.children[i] = offspring;
                return true;
            }
        }
        return false;
    }
}
