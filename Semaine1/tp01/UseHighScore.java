public class UseHighScore {
    public static void main(String[] args) {
        HighScore highScore = new HighScore();
        
        highScore.addFirstFreeSlot(new Score("Alice", 300, "29/01"));
        highScore.addFirstFreeSlot(new Score("Bob", 800, "29/01"));
        
        System.out.println(highScore);
    }
}
