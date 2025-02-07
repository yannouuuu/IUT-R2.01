class OneDicePlayerGame {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        DicePlayer player = new DicePlayer("Joueur 1");
        player.playUntil(dice, 20);
        System.out.println(player);
    }
}