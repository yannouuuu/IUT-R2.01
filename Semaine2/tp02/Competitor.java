public class Competitor {
    String numberSign;
    int time;
    int score;

    public Competitor(int numberSign, int score, int min, int sec){
        this.time = (min * 60) + sec;
        if (numberSign < 1 || numberSign > 100) {
            this.numberSign = null;
        } else {
            this.numberSign = "No" + numberSign;
        }
        if (score >= 0 && score <= 50) {
            this.score = score;
        } else {
            this.score = 0;
        }  
    }

    public String toString(){
        if (this.numberSign == null) {
            return "(-invalide-, " + this.score + " points, " + this.time + " s)";
        }
        return "(" + this.numberSign + ", " + this.score + " points, " + this.time + " s)";
    }

    public boolean equals(Competitor other) {
        if (this == other) {
            return true;
        } else if (other == null) {
            return false;
        }
        return this.numberSign.equals(other.numberSign) && this.score == other.score;
    }

    public boolean isFaster(Competitor other) {
        return this.time < other.time;
    }

    public static void main(String[] args) {
        Competitor competitor1 = new Competitor(7, 42, 13, 50);
        Competitor[] competitors = {
            new Competitor(1, 30, 12, 40),
            new Competitor(2, 25, 14, 20),
            new Competitor(3, 20, 15, 10)
        };

        System.out.println("Competitors faster than competitor1:");
        for (int i = 0; i < competitors.length; i++) {
            Competitor competitor = competitors[i];
            if (competitor.isFaster(competitor1)) {
                System.out.println(competitor);
            }
        }
    }
}