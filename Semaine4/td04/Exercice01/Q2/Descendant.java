package td04.Exercice01.Q2;

// Q2.3
public class Descendant {
    private static int nb = 0;
    private final int ID;
    private Mare asMother;
    private Stallion asFather;

    public Descendant(int ID, Mare asMother, Stallion asFather) {
        this.asMother = asMother;
        this.asFather = asFather;
        this.ID = Descendant.nb;
        Descendant.nb++;
    }

    boolean displaying = false;
    @Override
    public String toString() {
        String result;
        if (displaying) {
            result = ID;
        } else {
            displaying = true;
            result = "Descendant{" +
                    "ID=" + ID +
                    ", asMother=" + asMother +
                    ", asFather=" + asFather +
                    '}';
            displaying = false;
        }
        return result;
    }
}
