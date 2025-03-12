package semaine3.tp03;

public class UseCard {

    public static void main(String[] args) {
        Card c1 = new Card(Color.HEART, Rank.TEN);
        Card c2 = new Card(Color.HEART, Rank.JACK);
        Card c3 = new Card(Color.DIAMOND, Rank.TEN);
        Card c4 = new Card(Color.CLUB, Rank.SEVEN);
        Card c5 = new Card(Color.SPADE, null);
        Card c6 = new Card(null, Rank.JACK);
        Card c7 = new Card(Color.HEART, Rank.TEN);
        // equals scenario
        if (
            !c1.equals(c1) ||
            c1.equals(null) ||
            c1.equals(c2) ||
            c1.equals(c3) ||
            c1.equals(c4) ||
            c1.equals(c5) ||
            c1.equals(c6) ||
            !c1.equals(c7)
        ) System.out.println("equals FAILED");
        // compareColor scenario
        //else if(c1.compareColor(c1) != 0 || c1.compareColor(c2) != 0 || c1.compareColor(c3) <= 0 || c1.compareColor(c4) <= 0 || c1.compareColor(c5) >= 0 || c1.compareColor(c7) != 0)
        //    System.out.println("compareColor FAILED");
        // compareRank scenario
        //else if(c1.compareRank(c1) != 0 || c1.compareRank(c2) >= 0 || c1.compareRank(c3) != 0 || c1.compareRank(c4) <= 0 || c1.compareRank(c6) >= 0 || c1.compareRank(c7) != 0)
        //    System.out.println("compareRank FAILED");
        else System.out.println("Tests OK");
    }
}
