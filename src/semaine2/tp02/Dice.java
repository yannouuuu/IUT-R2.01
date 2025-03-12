package semaine2.tp02;
import java.util.Random;

public class Dice {
    int numberSides;
    Random rand;
    int value;

    public Dice(int numberSides) {
        if (numberSides > 0) {
            this.numberSides = numberSides;
        } else {
            this.numberSides = 1;
        }
        this.rand = new Random();
        roll();
    }

    public void roll() {
        value = rand.nextInt(numberSides) + 1;
    }

    public String toString() {
        return Integer.toString(value);
    }
}