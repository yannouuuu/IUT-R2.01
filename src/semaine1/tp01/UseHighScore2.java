package semaine1.tp01;
public class UseHighScore2 {
    public static void main(String[] args) {
        int size = Integer.parseInt("10");
        HighScore highScore = new HighScore(size);
        
        highScore.addFirstFreeSlot(new Score("Alice", 300, "29/01"));
        highScore.addFirstFreeSlot(new Score("Bob", 800, "29/01"));
        highScore.addFirstFreeSlot(new Score("Alice", 42, "30/01"));
        highScore.addFirstFreeSlot(new Score("Alice", 650, "31/01"));
        
        System.out.println(highScore);
    }
}
