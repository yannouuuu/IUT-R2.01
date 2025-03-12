package semaine3.td03;

public enum Civility {
    UNKNOWN(""),
    MAN("Mister"),
    WOMAN("Miss");
    private String civility;

    private Civility(String civility) {
        this.civility = civility;
    }

    public String toString() {
        return this.civility;
    }
}