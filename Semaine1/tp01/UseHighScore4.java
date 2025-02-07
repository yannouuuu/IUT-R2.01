public class UseHighScore4 {
    public static void main(String[] args) {
        HighScore highScore = new HighScore(3);

        highScore.addHighestFirst(new Score("Alice", 300, "29/01"));
        highScore.addHighestFirst(new Score("Bob", 800, "29/01"));
        highScore.addHighestFirst(new Score("Alice", 650, "31/01"));
        highScore.addHighestFirst(new Score("Carl", 750, "30/01"));
        highScore.addHighestFirst(new Score("Bob", 430, "31/01"));
        
        System.out.println(highScore);
    }
}
