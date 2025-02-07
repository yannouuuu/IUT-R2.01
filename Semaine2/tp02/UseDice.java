public class UseDice {
    public static void main(String[] args) {
        Dice dice6 = new Dice(6);
        System.out.println("Lancer 20 fois un dé à 6 faces");
        for (int i = 0; i < 20; i++) {
            dice6.roll();
            System.out.print(dice6 + " - ");
        }

        Dice dice10 = new Dice(10);
        System.out.println("Lancer 20 fois un dé à 10 faces");
        for (int i = 0; i < 20; i++) {
            dice10.roll();
            System.out.print(dice10 + " - ");
        }
    }
}