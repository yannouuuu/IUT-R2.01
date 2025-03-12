package semaine2.tp02;
class DicePlayer {
    private String name;
    private int totalValue;
    private int nbDiceRolls;

    public DicePlayer(String name) {
        this.name = name;
        this.totalValue = 0;
        this.nbDiceRolls = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getNbDiceRolls() {
        return nbDiceRolls;
    }

    public String toString() {
        return name + ": " + totalValue + " points en " + nbDiceRolls + " coups.";
    }

    public void play(Dice aDice) {
        aDice.roll();
        totalValue += aDice.value;
        nbDiceRolls++;
    }

    public void playUntil(Dice aDice, int objective) {
        while (totalValue <= objective) {
            play(aDice);
        }
    }
}