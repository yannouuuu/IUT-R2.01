public class UseCompetitor {
    public static void main(String[] args) {
        Competitor[] competitors = new Competitor[100];
        competitors[0] = new Competitor(1, 45, 15, 20);
        competitors[1] = new Competitor(2, 32, 12, 45);
        competitors[2] = new Competitor(5, 12, 13, 59);
        competitors[3] = new Competitor(12, 12, 15, 70);
        competitors[4] = new Competitor(32, 75, 15, 20);

        for (int i = 0; i < competitors.length; i++) {
            Competitor competitor = competitors[i];
            if (competitor != null && competitor.numberSign != null) {
                System.out.println(competitor);
            }
        }
    }
}  
